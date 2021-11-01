package BiefeldOAIPMH.recordDumpers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;

public class RecordDumperCSV implements RecordDumperInterface {

	public org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	protected static final String propKeyCSVOutputPath = "csvOutputPath";
	protected String csvOutputPath;
	
	public RecordDumperCSV(String configFilePath) throws RecordDumpException 
	{
		final String methodName = "::RecordDumperCSV() ";
		try 
		{
			Properties props = BiefeldOAIPMH.backendConnector.CommonUtils.loadConfigFile(configFilePath);
			
			// CSV Output Path
			this.csvOutputPath = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(props, propKeyCSVOutputPath, configFilePath);
		
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath);
			throw new RecordDumpException(e.getMessage());
		} catch (NullPointerException e)
		{
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath 
					+ " " + e.getMessage());
			throw new RecordDumpException(e.getMessage());
		}
	}

	@Override
	public void setLogger(String loggerName) 
	{
		this.logger = LogManager.getLogger(loggerName);
	}

	@Override
	public String getRecordDumperType() 
	{
		return genericRecordDumperName + csvRecordDumperName;
	}

	@Override
	public String getRecordDumperDesc() 
	{
		return "This Record Dumper dumps on the given CSV file";
	}

	@Override
	public void dump(String dumpName, HashMap<String, String> data) throws RecordDumpException 
	{
		final String methodName = "::dump() ";
		var dumpStr = RecordDumperInterface.dumpOperationToStr(dumpName, data);
		this.logger.info(methodName + dumpStr);
		File csvOutputFile = new File(this.csvOutputPath + "/" + dumpName + ".csv");
	    try (PrintWriter printWriter = new PrintWriter(csvOutputFile))
	    {
			data.entrySet()
				.stream()
				.map(entry -> (entry.getKey() + ", " + entry.getValue()))
				.forEach(printWriter::println);
	    } catch (Exception e)
	    {
	    	logger.error(methodName + "Failed to dump given data to path " + this.csvOutputPath 
	    			+ ", ERROR: " + e.getMessage());
	    	throw new RecordDumpException(e.getMessage());
	    }

	}

}
