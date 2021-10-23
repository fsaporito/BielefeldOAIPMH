package BiefeldOAIPMH.BiefeldOAIPMHClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

public class ConsoleClientConfig {

	protected static final String configFolder = "conf";
	protected static final String configFileName = "consoleClient.properties";
	protected static final String configFilePath = configFolder + "//" + configFileName;
	
	
	protected static final String propKeyLoggerPath = "loggerConfigPath";
	protected static final String propKeyLoggerName = "loggerName";
	
	protected String loggerPath;
	protected String loggerName;
	
	protected org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public ConsoleClientConfig() throws IOException
	{
		final String methodName = "::ConsoleClientConfig() ";
		try {
		
			var prop = loadConfigFile(configFilePath);
		
			// Logger Path
	 		this.loggerPath = readFromProp(prop, propKeyLoggerPath, configFilePath);
			//System.setProperty("log4j2.configurationFile", loggerPath);
			LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
			File file = new File(this.loggerPath);
			context.setConfigLocation(file.toURI());
			
			// Logger Name
			this.loggerName = readFromProp(prop, propKeyLoggerName, configFilePath);
			this.logger = LogManager.getLogger(this.loggerName);
			
			this.logger.info(methodName + " ConsoleClient ConfigObject initialized from " + configFilePath);
			this.logger.trace(methodName + "Read Properties: \n" + this.toString());
				
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath);
			throw e;
		}
	}

	protected Properties loadConfigFile(String path) throws IOException
	{
		Properties prop = new Properties();
 		FileInputStream fileStream = null;
 		fileStream = new FileInputStream(path);
 		prop.load(fileStream); 		   
		return prop;
	}
	
	protected String readFromProp(Properties prop, String propName, String configFilePath)
	{
		String propValue = prop.getProperty(propName);
 		if (propValue == null)
 		{
 			throw new NullPointerException("Property " + propName + " wasn't found in the prop file " + configFilePath);
 		}
 		return propValue;
	}
	
	public org.apache.logging.log4j.Logger getLogger() 
	{
		return logger;
	}

	@Override
	public String toString() {
		return "    - loggerPath=" + loggerPath + "\n    - loggerName=" + loggerName;
	}
	
	
	
}
