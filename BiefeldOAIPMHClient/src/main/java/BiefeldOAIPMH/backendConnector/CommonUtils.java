package BiefeldOAIPMH.backendConnector;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

	public CommonUtils() 
	{}
	
	public static Properties loadConfigFile(String path) throws IOException
	{
		Properties prop = new Properties();
 		FileInputStream fileStream = null;
 		fileStream = new FileInputStream(path);
 		prop.load(fileStream); 		   
		return prop;
	}
	
	public static String readFromProp(Properties prop, String propName, String configFilePath)
	{
		String propValue = prop.getProperty(propName);
 		if (propValue == null)
 		{
 			throw new NullPointerException("Property " + propName + " wasn't found in the prop file " + configFilePath);
 		}
 		return propValue;
	}

}