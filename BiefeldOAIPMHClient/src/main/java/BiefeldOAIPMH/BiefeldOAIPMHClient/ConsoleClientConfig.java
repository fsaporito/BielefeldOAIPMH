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
	protected String loggerPath;
	
	protected static final String propKeyClientLoggerName = "clientLoggerName";
	protected String clientLoggerName;
	
	protected static final String propKeyBackendConnectorLoggerName = "backendConnectorLoggerName";
	protected String backendConnectorLoggerName;
	
	protected static final String propKeyGetterType = "getterType";
	protected String getterType;
	protected static final String propKeyGetterLoggerName = "getterLoggerName";
	protected String getterLoggerName;
	protected static final String propKeyGetterPropsFile = "getterPropsFileName";
	protected String getterPropsFileName;
	
	protected static final String propKeyDumperType = "dumperType";
	protected String dumperType;
	protected static final String propKeyDumperLoggerName = "dumperLoggerName";
	protected String dumperLoggerName;
	protected static final String propKeyDumperPropsFile = "dumperPropsFileName";
	protected String dumperPropsFileName;
	
	protected org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public ConsoleClientConfig() throws IOException
	{
		final String methodName = "::ConsoleClientConfig() ";
		try {
		
			var prop = loadConfigFile(configFilePath);
		
			// Logger Path
	 		this.loggerPath = readFromProp(prop, propKeyLoggerPath, configFilePath);
			LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
			File file = new File(this.loggerPath);
			context.setConfigLocation(file.toURI());
			
			// Client Logger Name
			this.clientLoggerName = readFromProp(prop, propKeyClientLoggerName, configFilePath);
			this.logger = LogManager.getLogger(this.clientLoggerName);
			
			// Backend Connector Logger Name
			this.backendConnectorLoggerName = readFromProp(prop, propKeyBackendConnectorLoggerName, configFilePath);
			
			// Record Getter
			this.getterType = readFromProp(prop, propKeyGetterType, configFilePath);
			this.getterLoggerName = readFromProp(prop, propKeyGetterLoggerName, configFilePath);
			this.getterPropsFileName = readFromProp(prop, propKeyGetterPropsFile, configFilePath);
			
			// Record Dumper
			this.dumperType = readFromProp(prop, propKeyDumperType, configFilePath);
			this.dumperLoggerName = readFromProp(prop, propKeyDumperLoggerName, configFilePath);
			this.dumperPropsFileName = readFromProp(prop, propKeyDumperPropsFile, configFilePath);
			
			this.logger.info(methodName + " ConsoleClient ConfigObject initialized from " + configFilePath);
			this.logger.trace(methodName + "Read Properties: \n" + this.toString());
				
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath);
			throw e;
		}
	}

	public String getGetterPropsFileName() {
		return getterPropsFileName;
	}

	public String getDumperPropsFileName() {
		return dumperPropsFileName;
	}

	public String getClientLoggerName() {
		return clientLoggerName;
	}

	public String getBackendConnectorLoggerName() {
		return backendConnectorLoggerName;
	}

	public String getGetterType() {
		return getterType;
	}

	public String getGetterLoggerName() {
		return getterLoggerName;
	}

	public String getDumperType() {
		return dumperType;
	}

	public String getDumperLoggerName() {
		return dumperLoggerName;
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
		return "    - loggerPath=" + this.loggerPath 
		   + "\n    - cLientLoggerName=" + this.clientLoggerName
		   + "\n    - backendConnectorLoggerName=" + this.backendConnectorLoggerName
		   + "\n    - getterType=" + this.getterType
		   + "\n    - getterLoggerName=" + this.getterLoggerName
		   + "\n    - getterPropsFileName=" + this.getterPropsFileName
		   + "\n    - dumperType=" + this.dumperType
		   + "\n    - dumperLoggerName=" + this.dumperLoggerName
		   + "\n    - dumperPropsFileName=" + this.dumperPropsFileName;
	}
	
	
	
}
