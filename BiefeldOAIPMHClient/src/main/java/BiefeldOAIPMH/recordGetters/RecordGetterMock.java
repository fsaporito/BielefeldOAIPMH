package BiefeldOAIPMH.recordGetters;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;

public class RecordGetterMock implements RecordGetterInterface {

	public org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
	
	public RecordGetterMock() 
	{
	}
	
	@Override
	public void setLogger(String loggerName)
	{
		this.logger = LogManager.getLogger(loggerName);
	}

	@Override
	public String getRecordGetterType()
	{
		return genericRecordGetterName + RecordGetterInterface.mockRecordGetterName;
	}

	@Override
	public String getRecordGetterDesc()
	{
		return "This Record Getter just mocks a real one without asking anything to anyone";
	}

	@Override
	public HashMap<String, String> ask(String actionName, HashMap<String, String> parametersMap)
			throws RecordAskException 
	{
		final String methodName = "::ask() ";
		var askStr = RecordGetterInterface.askOperationToStr(actionName, parametersMap);
		this.logger.info(methodName + askStr);
		HashMap<String, String> returnData = new HashMap<String, String>();
		returnData.put("MockKey1", "MockValue1");
		returnData.put("MockKey2", "MockValue2");
		return returnData;
	}
	
}
