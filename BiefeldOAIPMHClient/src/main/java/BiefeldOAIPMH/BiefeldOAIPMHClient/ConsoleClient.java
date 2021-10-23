package BiefeldOAIPMH.BiefeldOAIPMHClient;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;

public class ConsoleClient 
{
	protected ConsoleClientConfig config;
	protected org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public ConsoleClient() throws IOException
	{
		final String methodName = "::BackendAPI()";
		try {
			this.config = new ConsoleClientConfig();
			this.logger = this.config.getLogger();
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file, aborting");
			throw e;
		}
		this.logger.info(methodName + " Console ClientObject initialized");
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
    	
        // Instantiate ConsoleClient
    	try {
    		System.out.println(methodName + "Instantiate ConsoleClient");
			var client = new ConsoleClient();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	printGoodBye(methodName);
    	
    }
}
