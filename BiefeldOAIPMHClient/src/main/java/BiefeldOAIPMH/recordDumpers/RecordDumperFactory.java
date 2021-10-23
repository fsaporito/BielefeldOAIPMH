package BiefeldOAIPMH.recordDumpers;

public class RecordDumperFactory {

	public RecordDumperFactory() {
	}
	
	public static RecordDumperInterface buildRecordDumper(String recordDumperName) 
			throws RecordDumpException
	{
		if (recordDumperName == null)
			throw new RecordDumpException("Received RecordDumper Name is null");
		if (recordDumperName.isBlank())
			throw new RecordDumpException("Received RecordDumper Name is blanck");
		if (recordDumperName.equalsIgnoreCase(RecordDumperInterface.mockRecordDumperName))
			return new RecordDumperMock();
		throw new RecordDumpException("Couldn't build the given recordDumper: " + recordDumperName);
	}

}
