package BiefeldOAIPMH.recordGetters;

public class RecordGetterFactory {

	public RecordGetterFactory() 
	{}
	
	public static RecordGetterInterface buildRecordGetter(String recordGetterName, String configFilePath) 
			throws RecordGetterException
	{
		if (recordGetterName == null)
			throw new RecordGetterException("Received RecordGetter Name is null");
		if (recordGetterName.isBlank())
			throw new RecordGetterException("Received RecordGetter Name is blanck");
		if (recordGetterName.equalsIgnoreCase(RecordGetterInterface.mockRecordGetterName))
			return new RecordGetterMock(configFilePath);
		throw new RecordGetterException("Couldn't build the given recordGetter: " + recordGetterName);
	}

}
