package BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor;

import java.util.HashMap;

public class NumberOfRecordsPerOrcidAuthor 
{

	private long id;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerOrcidAuthor(long id) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.data.put("NumberOfRecordsPerOrcidAuthor_KEY1", "VALUE1");
		this.data.put("NumberOfRecordsPerOrcidAuthor_KEY2", "VALUE2");
	}

	public long getId()
	{
		return this.id;
	}
	
	public HashMap<String, String> getData()
	{
		return this.data;
	}

}
