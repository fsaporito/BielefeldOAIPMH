package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped;

import java.util.HashMap;

public class NumberOfJournalArticlesSinceYearGroupedByYear 
{

	private long id;
	private long startYear;
	private long yearRange;
	private HashMap<String, String> data;
		
	public NumberOfJournalArticlesSinceYearGroupedByYear(long id, int startYear, int yearRange, HashMap<Integer, Integer> data) 
	{
		this.id = id;
		this.data = new HashMap<>();
		this.startYear = startYear;
		this.yearRange = yearRange;
		processData(data);
		
	}

	private void processData(HashMap<Integer, Integer> data)
	{
		if (data == null)
			throw new IllegalArgumentException("Received Data was null");
		for (var entry: data.entrySet())
		{
			int recordPublicationYear = entry.getKey();
			if (recordPublicationYear < startYear)
				continue;
			String rangeValueStr = computeRange(recordPublicationYear);
			int savedRecordNum = 0;
			if (this.data.containsKey(rangeValueStr))
				savedRecordNum = Integer.parseInt(this.data.get(rangeValueStr));
			int recordNum = entry.getValue();
			savedRecordNum += recordNum;
			this.data.put(rangeValueStr, Integer.toString(savedRecordNum));			
		}
	}
	
	private String computeRange(int recordPublicationYear)
	{
		int diff = (int) (recordPublicationYear - this.startYear);
		int rangeNum = (int) (diff / this.yearRange);
		int rangeStartYear = (int) (this.startYear + this.yearRange * rangeNum);
		int rangeEndYear = (int) (this.yearRange - 1);
		return Integer.toString(rangeStartYear) + " - " + Integer.toString(rangeStartYear + rangeEndYear);
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
