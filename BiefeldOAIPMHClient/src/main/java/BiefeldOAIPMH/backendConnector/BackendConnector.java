package BiefeldOAIPMH.backendConnector;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;

import BiefeldOAIPMH.recordDumpers.RecordDumpException;
import BiefeldOAIPMH.recordDumpers.RecordDumperInterface;
import BiefeldOAIPMH.recordGetters.RecordAskException;
import BiefeldOAIPMH.recordGetters.RecordGetterInterface;

public class BackendConnector<RecordGetter extends RecordGetterInterface, 
								RecordDumper extends RecordDumperInterface>
{
	
	protected RecordGetter getter;
	protected RecordDumper dumper;
	
	protected org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public BackendConnector(RecordGetter getter, RecordDumper dumper)
	{
		this(getter, dumper, LogManager.ROOT_LOGGER_NAME);		
	}
	public BackendConnector(RecordGetter getter, RecordDumper dumper, String LoggerName)
	{
		final String methodName = "::BackendConnector() ";
		if (getter == null)
			throw new NullPointerException("Record Getter was NULL");
		if (dumper == null)
			throw new NullPointerException("Record Dumper was NULL");
		this.setLogger(LoggerName);
		this.logger.trace(methodName + "Initializing Backend Connector");
		this.getter = getter;
		this.logger.info(methodName + "Selected Record Getter => " + this.getter.getRecordGetterType());
		this.logger.trace(methodName + this.getter.getRecordGetterDesc());
		this.dumper = dumper;
		this.logger.info(methodName + "Selected Record Dumper => " + this.dumper.getRecordDumperType());
		this.logger.trace(methodName + this.dumper.getRecordDumperDesc());
	}
	
	public void setLogger(String loggerName)
	{
		this.logger = LogManager.getLogger(loggerName);
	}
	
	public void getNumberOfRecordsPerPublicationYear()
	{
		final String opName = RecordGetterInterface.OP_NumberOfRecordsPerPublicationYear;
		try {
			HashMap<String, String> data = getter.ask(opName, null);
			dumper.dump(opName, data);
		} catch (RecordAskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordDumpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getNumberOfRecordsPerTypology()
	{
		final String opName = RecordGetterInterface.OP_NumberOfRecordsPerTypology;
		try
		{
			HashMap<String, String> data = getter.ask(opName, null);
			dumper.dump(opName, data);
		} catch (RecordAskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordDumpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getNumberOfJournalArticlesSinceYearGroupedByYearRange(int startYear, int yearRange)
	{
		final String opName = RecordGetterInterface.OP_NumberOfJournalArticlesSinceYearGroupedByYearRange;
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("startYear", Integer.toString(startYear));
		parameters.put("yearRange", Integer.toString(yearRange));
		try
		{
			HashMap<String, String> data = getter.ask(opName, parameters);
			dumper.dump(opName, data);
		} catch (RecordAskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordDumpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void numberOfRecordsPerAuthor()
	{
		final String opName = RecordGetterInterface.OP_NumberOfRecordsPerAuthor;
		try
		{
			HashMap<String, String> data = getter.ask(opName, null);
			dumper.dump(opName, data);
		} catch (RecordAskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordDumpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void numberOfRecordsPerORCIDAuthor()
	{
		final String opName = RecordGetterInterface.OP_NumberOfRecordsPerORCIDAuthor;
		try
		{
			HashMap<String, String> data = getter.ask(opName, null);
			dumper.dump(opName, data);
		} catch (RecordAskException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecordDumpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
