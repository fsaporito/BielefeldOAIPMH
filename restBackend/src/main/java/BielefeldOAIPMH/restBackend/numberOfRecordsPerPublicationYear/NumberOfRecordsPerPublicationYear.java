package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import java.util.HashMap;

public class NumberOfRecordsPerPublicationYear 
{

	private long id;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerPublicationYear(long id) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.data.put("NumberOfRecordsPerPublicationYear_KEY1", "VALUE1");
		this.data.put("NumberOfRecordsPerPublicationYear_KEY2", "VALUE2");
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
