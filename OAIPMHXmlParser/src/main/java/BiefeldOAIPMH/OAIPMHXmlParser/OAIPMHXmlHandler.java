package BiefeldOAIPMH.OAIPMHXmlParser;

import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.openarchives.oai._2.ListRecordsType;
import org.openarchives.oai._2.OAIPMHtype;
import org.openarchives.oai._2.RecordType;

public class OAIPMHXmlHandler {

	protected final static String urlStr = "https://pub.uni-bielefeld.de/oai?verb=ListRecords";
	protected final static String resuptionTokenParameterName = "&resumptionToken=";
	public OAIPMHXmlHandler() 
	{}
	
	public static ArrayList<RecordType> parse(Boolean getAllData) 
			throws MalformedURLException, JAXBException
	{
		ArrayList<RecordType> recordsList = new ArrayList<RecordType>();
		
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
    		OAIPMHtype res = Parser.parseFromUrl(currentUrl);
    		ListRecordsType recordType = res.getListRecords();
    		var resumptionToken = recordType.getResumptionToken();
    		resumptionTokenValue = resumptionToken.getValue();
    		ArrayList<RecordType> batchRecordList = (ArrayList<RecordType>) recordType.getRecord();
    		recordsList.addAll(batchRecordList);
		} while (getAllData && !resumptionTokenValue.isEmpty());
	
		return recordsList;
	}

}
