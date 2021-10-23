package BiefeldOAIPMH.recordDumpers;

import java.util.HashMap;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;


public class RecordDumperMock implements RecordDumperInterface
{

	public org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public RecordDumperMock(String configFilePath)
	{
	}

	@Override
	public void setLogger(String loggerName) 
	{
		this.logger = LogManager.getLogger(loggerName);
	}

	@Override
	public String getRecordDumperType()
	{
		return genericRecordDumperName + mockRecordDumperName;
	}

	@Override
	public String getRecordDumperDesc() {
		return "This Record Dumper just mocks a real one without dumping anything to anywhere except to the log";
	}

	@Override
	public void dump(String dumpName, HashMap<String, String> data) throws RecordDumpException 
	{
		final String methodName = "::dump() ";
		var dumpStr = RecordDumperInterface.dumpOperationToStr(dumpName, data);
		String dataStr = "\n"; 
		if (!data.isEmpty())
		{
			dataStr += data.entrySet()
					.stream()
		            .map(entry -> "    - " + entry.getKey() + " : " + entry.getValue())
		            .collect(Collectors.joining("\n "));
		}
		this.logger.info(methodName + dumpStr + dataStr);
	}

}
