package BiefeldOAIPMH.OAIPMHXmlParser;

import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.datacite.schema.kernel_4.Resource;
import org.openarchives.oai._2.ListRecordsType;
import org.openarchives.oai._2.OAIPMHtype;
import org.openarchives.oai._2.RecordType;

import BielefeldOAIPMH.records.Author;
import BielefeldOAIPMH.records.TaskRecord;

public class OAIPMHXmlHandler {

	protected final static String urlStr = "https://pub.uni-bielefeld.de/oai?verb=ListRecords";
	protected final static String resuptionTokenParameterName = "&resumptionToken=";
	public OAIPMHXmlHandler() 
	{}
	
	public static ArrayList<TaskRecord> parse(Boolean getAllData) 
			throws MalformedURLException, JAXBException
	{
		ArrayList<RecordType> recordsListOAIPMH = new ArrayList<RecordType>();
		
		String resumptionTokenValue = "";
    	do
		{
    		String currentUrl = urlStr;
    		if (!resumptionTokenValue.isEmpty())
    		{
    			currentUrl += resuptionTokenParameterName + resumptionTokenValue;
    		}
    		else
    		{
    			currentUrl += "&metadataPrefix=oai_datacite";
    		}
    		OAIPMHtype res = Parser.parseOAIPMHFromUrl(currentUrl);
    		ListRecordsType recordType = res.getListRecords();
    		var resumptionToken = recordType.getResumptionToken();
    		resumptionTokenValue = resumptionToken.getValue();
    		ArrayList<RecordType> batchRecordList = (ArrayList<RecordType>) recordType.getRecord();
    		recordsListOAIPMH.addAll(batchRecordList);
		} while (getAllData && !resumptionTokenValue.isEmpty());
    	
    	ArrayList<TaskRecord> recordsList = new ArrayList<>();
    	
    	for (var recordXML: recordsListOAIPMH)
		{
			var header = recordXML.getHeader();
			var metadata = recordXML.getMetadata();
			String recordID = header.getIdentifier();	
			String recordTypology = header.getSetSpec().get(1);
			ArrayList<Author> authors = new ArrayList<>();
			var resource = (Resource) metadata.getAny();
			int publicationYear = Integer.parseInt(resource.getPublicationYear());
			var creators = resource.getCreators();
			if (creators != null)
			{
				for (var creator: creators.getCreator())
				{
					String creatorName = creator.getCreatorName().getValue();
					var creatorNameSplit = creatorName.split(", ");
					String familyName = creatorNameSplit[0];
					String givenName = creatorNameSplit[1];
					String ORCID = null;
					var nameIdentifierList = creator.getNameIdentifier();
					for (var nameIdentifier: nameIdentifierList)
					{
						if (nameIdentifier.getNameIdentifierScheme().compareToIgnoreCase("ORCID") == 0)
						{
							ORCID = nameIdentifier.getValue();
							break;
						}
					}
					Author author = new Author(givenName, familyName, ORCID);
					authors.add(author);
				}
			}
			TaskRecord record = new TaskRecord(recordID, recordTypology, publicationYear, authors);
			recordsList.add(record);
		}
    		
		return recordsList;
	}

}
