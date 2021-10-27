package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import java.util.HashMap;

public class NumberOfRecordsPerPublicationYear 
{

	private long id;
	private long startYear;
	private long yearRange;
	private HashMap<String, String> data;
		
	public NumberOfRecordsPerPublicationYear(long id, int startYear, int yearRange) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.startYear = startYear;
		this.yearRange = yearRange;
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
