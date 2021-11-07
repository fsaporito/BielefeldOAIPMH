package BiefeldOAIPMH.OAIPMHXmlParser;

import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import org.openarchives.oai._2.RecordType;

import BielefeldOAIPMH.records.TaskRecord;

public class OAIPMHXmlParserMain 
{
    public static void main( String[] args )
    {
    	ArrayList<TaskRecord> recordsList = new ArrayList<>();
		try {
			recordsList = OAIPMHXmlHandler.parse(true);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Got a Total of " + recordsList.size() + " records");
    }
}
