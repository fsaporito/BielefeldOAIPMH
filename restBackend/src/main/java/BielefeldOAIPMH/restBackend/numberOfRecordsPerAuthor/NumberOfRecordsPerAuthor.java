package BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor;

import java.util.HashMap;

public class NumberOfRecordsPerAuthor 
{

	private long id;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerAuthor(long id) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.data.put("NumberOfRecordsPerAuthor_KEY1", "VALUE1");
		this.data.put("NumberOfRecordsPerAuthor_KEY2", "VALUE2");
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
