package BiefeldOAIPMH.recordDumpers;

public class RecordDumperFactory {

	public RecordDumperFactory() {
	}
	
	public static RecordDumperInterface buildRecordDumper(String recordDumperName)
	{
		return new RecordDumperMock();
	}

}
