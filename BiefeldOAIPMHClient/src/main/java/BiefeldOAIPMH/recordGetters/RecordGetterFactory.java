package BiefeldOAIPMH.recordGetters;

public class RecordGetterFactory {

	public RecordGetterFactory() {
	}
	
	public static RecordGetterInterface buildRecordGetter(String recordGetterName)
	{
		return new RecordGetterMock();
	}

}
