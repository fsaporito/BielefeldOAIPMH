package BiefeldOAIPMH.BiefeldOAIPMHClient;

import java.io.File;
import java.io.IOException;

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
		try 
		{
		
			var prop = BiefeldOAIPMH.backendConnector.CommonUtils.loadConfigFile(configFilePath);
		
			// Logger Path
	 		this.loggerPath = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyLoggerPath, configFilePath);
			LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
			File file = new File(this.loggerPath);
			context.setConfigLocation(file.toURI());
			
			// Client Logger Name
			this.clientLoggerName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyClientLoggerName, configFilePath);
			this.logger = LogManager.getLogger(this.clientLoggerName);
			
			// Backend Connector Logger Name
			this.backendConnectorLoggerName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyBackendConnectorLoggerName, configFilePath);
			
			// Record Getter
			this.getterType = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyGetterType, configFilePath);
			this.getterLoggerName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyGetterLoggerName, configFilePath);
			this.getterPropsFileName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyGetterPropsFile, configFilePath);
			
			// Record Dumper
			this.dumperType = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyDumperType, configFilePath);
			this.dumperLoggerName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyDumperLoggerName, configFilePath);
			this.dumperPropsFileName = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(prop, propKeyDumperPropsFile, configFilePath);
			
			this.logger.info(methodName + " ConsoleClient ConfigObject initialized from " + configFilePath);
			this.logger.trace(methodName + "Read Properties: \n" + this.toString());
				
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath);
			throw e;
		} catch (NullPointerException e)
		{
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath 
					+ " " + e.getMessage());
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
