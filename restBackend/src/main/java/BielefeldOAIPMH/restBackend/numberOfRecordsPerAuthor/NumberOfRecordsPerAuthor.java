package BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor;

import java.util.HashMap;

public class NumberOfRecordsPerAuthor 
{

	private long id;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerAuthor(long id, HashMap<String, String> data) 
	{
		this.id = id;
		this.data = new HashMap<>();
		if (data == null)
			throw new IllegalArgumentException("Received Data was null");
		this.data.putAll(data);
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
