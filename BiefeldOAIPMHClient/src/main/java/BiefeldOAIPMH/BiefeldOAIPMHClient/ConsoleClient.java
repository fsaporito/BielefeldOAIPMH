package BiefeldOAIPMH.BiefeldOAIPMHClient;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import BiefeldOAIPMH.backendConnector.BackendConnector;
import BiefeldOAIPMH.recordDumpers.RecordDumpException;
import BiefeldOAIPMH.recordDumpers.RecordDumperFactory;
import BiefeldOAIPMH.recordDumpers.RecordDumperInterface;
import BiefeldOAIPMH.recordGetters.RecordGetterException;
import BiefeldOAIPMH.recordGetters.RecordGetterFactory;
import BiefeldOAIPMH.recordGetters.RecordGetterInterface;

public class ConsoleClient 
{
	protected ConsoleClientConfig config;
	protected org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	protected BackendConnector<RecordGetterInterface, RecordDumperInterface> backendConnector;

	public ConsoleClient() throws IOException, RecordGetterException, RecordDumpException
	{
		final String methodName = "::BackendAPI()";
		try {
			
			this.config = new ConsoleClientConfig();
			
			this.logger = this.config.getLogger();
			
			RecordGetterInterface getter = RecordGetterFactory.buildRecordGetter(this.config.getGetterType(),
					ConsoleClientConfig.configFolder + "\\" + this.config.getGetterPropsFileName());
			getter.setLogger(this.config.getGetterLoggerName());
			
			RecordDumperInterface dumper = RecordDumperFactory.buildRecordDumper(this.config.getDumperType(),
					ConsoleClientConfig.configFolder + "\\" + this.config.getDumperPropsFileName());
			dumper.setLogger(this.config.getDumperLoggerName());
			
			this.backendConnector = new BackendConnector<> (getter, dumper, this.config.getBackendConnectorLoggerName());
		
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file, aborting");
			throw e;
		} catch (RecordGetterException e) {
			logger.fatal(methodName + e.getMessage());
			throw e;
		} catch (RecordDumpException e) {
			logger.fatal(methodName + e.getMessage());
			throw e;
		}
		this.logger.info(methodName + " Console ClientObject initialized");
	}
	
	public void execute()
	{
		final String methodName = "::execute(): ";
		
		this.logger.info(methodName + "Get Number of Publications per Year");
		this.backendConnector.getNumberOfPublicationsPerYear();
		
		this.logger.info(methodName + "Get Number of Records per Typology");
		this.backendConnector.getNumberOfRecordsPerTypology();
		
		int startYear = 1985;
		int rangeYear = 5;
		this.logger.info(methodName + "Get Number of Journal Articles since " + startYear + " grouped by a " + rangeYear + " year range");
		this.backendConnector.getNumberOfJournalArticlesSinceYearGroupedByYearRange(startYear, rangeYear);
		
		this.logger.info(methodName + "Get Number of Records per Author");
		this.backendConnector.numberOfRecordsPerAuthor();
		
		this.logger.info(methodName + "Get Number of Records per ORCID Author");
		this.backendConnector.numberOfRecordsPerORCIDAuthor();
	}
	
	public static void printGoodBye(String methodName)
	{
		System.out.println("");
    	System.out.println("");
    	System.out.println(methodName + "Closing Down");
    	System.out.println(methodName + "Bye :)");
	}
	
    public static void main( String[] args )
    {
    	final String methodName = "::main() ";
    	System.out.println(methodName + "Hi, Starting Up");
    	System.out.println("");
    	
    	try {
    		System.out.println(methodName + "Instantiate ConsoleClient");
			var client = new ConsoleClient();
			client.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	printGoodBye(methodName);
    	
    }
}
