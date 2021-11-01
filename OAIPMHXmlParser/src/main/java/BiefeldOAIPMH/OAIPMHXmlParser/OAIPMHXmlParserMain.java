package BiefeldOAIPMH.OAIPMHXmlParser;

public class OAIPMHXmlParserMain 
{
    public static void main( String[] args )
    {
    	var recordsList = OAIPMHXmlHandler.parse(true);
    	System.out.println("Got a Total of " + recordsList.size() + " records");
    }
}
