package BiefeldOAIPMH.recordDumpers;

import java.util.HashMap;


public interface RecordDumperInterface {
	
	public static final String genericRecordDumperName = "RecordDumper";
	public static final String mockRecordDumperName = "Mock";
	
	public void setLogger(String loggerName);
	
	public String getRecordDumperType();
	public String getRecordDumperDesc();
	public void dump(String dumpName, HashMap<String, String> data) throws RecordDumpException;
	
	public static String dumpOperationToStr(String dumpName, HashMap<String, String> data)
	{
		int dataEntries = 0;
		if (data != null && !data.isEmpty())
		{
			dataEntries = data.size();
		}
		
		String dumpStr = "Received dump operation " + dumpName + ", num of data entries: " + dataEntries;
		
		return dumpStr;
	}
}
