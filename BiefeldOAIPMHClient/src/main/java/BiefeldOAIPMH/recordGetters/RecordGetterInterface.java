package BiefeldOAIPMH.recordGetters;

import java.util.HashMap;
import java.util.stream.Collectors;

public interface RecordGetterInterface 
{
	
	public static final String genericRecordGetterName = "RecordGetter";
	public static final String mockRecordGetterName = "Mock";
	public static final String restRecordGetterName = "Rest";
	
	final static String OP_NumberOfRecordsPerAuthor = "numberOfRecordsPerAuthor";
	final static String OP_NumberOfRecordsPerORCIDAuthor = "numberOfRecordsPerOrcidAuthor";
	final static String OP_NumberOfRecordsPerPublicationYear = "numberOfRecordsPerPublicationYear";
	final static String OP_NumberOfRecordsPerTypology = "NumberOfRecordsPerTypology";
	final static String OP_NumberOfJournalArticlesSinceYearGroupedByYearRange = "numberOfJournalRecordsSinceYearGrouperByYear";
	
	public void setLogger(String loggerName);
	
	public String getRecordGetterType();
	public String getRecordGetterDesc();
	public HashMap<String, String> ask(String actionName, HashMap<String, String> parametersMap) throws RecordAskException;
	
	public static String askOperationToStr(String actionName, HashMap<String, String> parametersMap)
	{
		String askStr = "Received ask operation " + actionName + " with parameters:";
		if (parametersMap == null || parametersMap.isEmpty())
		{
			askStr += " None";
		}
		else
		{
			askStr += "\n";
			askStr += parametersMap.entrySet()
	            .stream()
	            .map(entry -> "    - " + entry.getKey() + " : " + entry.getValue())
	            .collect(Collectors.joining("\n"));
		}
		return askStr;
	}
	
	
}
