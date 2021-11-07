package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped;

import java.util.HashMap;

public class NumberOfJournalArticlesSinceYearGroupedByYear 
{

	private long id;
	private long startYear;
	private long yearRange;
	private HashMap<String, String> data;
		
	public NumberOfJournalArticlesSinceYearGroupedByYear(long id, int startYear, int yearRange, HashMap<String, String> data) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.startYear = startYear;
		this.yearRange = yearRange;
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
