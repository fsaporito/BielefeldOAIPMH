package BiefeldOAIPMH.recordGetters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;

public class RecordGetterRest implements RecordGetterInterface {

	public org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	protected static final String propKeyRestBackendAdress = "restBackendAddress";
	protected String restBackendAddress;
	
	public RecordGetterRest(String configFilePath) throws RecordGetterException 
	{
		final String methodName = "::RecordGetterRest() ";
		try 
		{
			Properties props = BiefeldOAIPMH.backendConnector.CommonUtils.loadConfigFile(configFilePath);
			
			// Rest Backend Address
			this.restBackendAddress = BiefeldOAIPMH.backendConnector.CommonUtils.readFromProp(props, propKeyRestBackendAdress, configFilePath);
		
		} catch (IOException e) {
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath);
			throw new RecordGetterException(e.getMessage());
		} catch (NullPointerException e)
		{
			logger.fatal(methodName + "Couldn't load configuration file " + configFilePath 
					+ " " + e.getMessage());
			throw new RecordGetterException(e.getMessage());
		}
	}
	
	@Override
	public void setLogger(String loggerName)
	{
		this.logger = LogManager.getLogger(loggerName);
	}

	@Override
	public String getRecordGetterType()
	{
		return genericRecordGetterName + RecordGetterInterface.restRecordGetterName;
	}

	@Override
	public String getRecordGetterDesc()
	{
		return "This Record Getter will ask data to the rest service at " + restBackendAddress;
	}

	@Override
	public HashMap<String, String> ask(String actionName, HashMap<String, String> parametersMap)
			throws RecordAskException
	{
		final String methodName = "::ask() ";
		this.logger.info(methodName + "Endpoint is " + this.restBackendAddress);
		var askStr = RecordGetterInterface.askOperationToStr(actionName, parametersMap);
		this.logger.info(methodName + askStr);
		
		// Setup Request
		Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target(this.restBackendAddress + "/" + actionName);
        
        if (parametersMap != null)
        {
        	for (var entries = parametersMap.entrySet().iterator(); entries.hasNext(); ) 
	        {
	            var entry = entries.next();
	            target = target.queryParam(entry.getKey(), entry.getValue());
	        }
        }

        // Get Response
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		
		// Parse into the wanted data type
		HashMap<String, String> data = new HashMap<>();
		
		try 
		{
		   if (response.getStatus() == 200) {
		      response.bufferEntity();
		      DataRequest dataReq = response.readEntity(DataRequest.class);
		      data = dataReq.getData();
		   }
		   else
		   {
			   throw new RecordAskException("Bad request: Http Error Code " + response.getStatus());
		   }
		}
		catch (Exception e)
		{
			response.close();
			throw new RecordAskException(e.getMessage());
		} finally {
		  response.close();
		}
			
		// Return
		return data;
		
	}
	
}
