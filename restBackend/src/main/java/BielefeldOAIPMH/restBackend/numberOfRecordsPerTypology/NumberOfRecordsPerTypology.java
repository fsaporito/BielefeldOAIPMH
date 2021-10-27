package BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology;

import java.util.HashMap;

public class NumberOfRecordsPerTypology 
{

	private long id;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerTypology(long id) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.data.put("KEY1", "VALUE1");
		this.data.put("KEY2", "VALUE2");
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
