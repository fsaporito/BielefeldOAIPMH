package BielefeldOAIPMH.restBackend.statistics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import BiefeldOAIPMH.OAIPMHXmlParser.OAIPMHXmlHandler;
import BielefeldOAIPMH.records.TaskRecord;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsJournalsXPublicationYear;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsJournalsXPublicationYearRepository;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXAuthor;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXAuthorRepository;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXORCIDAuthor;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXORCIDAuthorRepository;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXPublicationYear;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXPublicationYearRepository;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXTypology;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXTypologyRepository;

@Component
public class StatisticCalculatorScheduled {

	private static final Logger log = LoggerFactory.getLogger(StatisticCalculatorScheduled.class);
	
	@Autowired
	private RecordsXAuthorRepository recordsXAuthorRepository;
	
	@Autowired
	private RecordsXORCIDAuthorRepository recordsXORCIDAuthorRepository;
	
	@Autowired
	private RecordsXPublicationYearRepository recordsXPublicationYearRepository;
	
	@Autowired
	private RecordsXTypologyRepository recordsXTypologyRepository;
	
	@Autowired
	private RecordsJournalsXPublicationYearRepository recordsJournalsXPublicationYearRepository;
	
	public StatisticCalculatorScheduled() 
	{}
	
	@Scheduled(fixedRate = 24, timeUnit = TimeUnit.HOURS)
	public void computeStatistics() 
	{
		
		// Download Data
		log.info("Downloading new Data");
		ArrayList<TaskRecord> recordsList = downloadData();
		log.info("Got " + recordsList.size() + " new records");
		if (recordsList.isEmpty()) // No new records
		{
			return;
		}
		
		// Compute numberOfRecordsPerAuthor Statistics
		numberOfRecordsPerAuthorComputator(recordsList, recordsXAuthorRepository);		
		
		// Compute numberOfRecordsPerORCIDAuthor Statistics
		numberOfRecordsPerORCIDAuthorComputator(recordsList, recordsXORCIDAuthorRepository);
		
		// Compute numberOfRecordsPerPublicationYear Statistics
		numberOfRecordsPerPublicationYearComputator(recordsList, recordsXPublicationYearRepository);
		
		// Compute numberOfRecordsPerTypology Statistics
		numberOfRecordsPerTypologyComputator(recordsList, recordsXTypologyRepository);		
		
		// Compute numberOfJournalRecordsPerPublicationYear Statistics
		numberOfJournalRecordsPerPublicationYearComputator(recordsList, recordsJournalsXPublicationYearRepository);
		
	}

	protected ArrayList<TaskRecord> downloadData()
	{
		ArrayList<TaskRecord> recordsList = new ArrayList<>();
		try {
			recordsList = OAIPMHXmlHandler.parse(true);
		} catch (Exception e) {
			log.error("Failed to download new Data: " + e.getMessage());
		}
		return recordsList;
	}
	
	// Compute numberOfRecordsPerAuthor Statistics
	private void numberOfRecordsPerAuthorComputator(ArrayList<TaskRecord> recordsList,
			RecordsXAuthorRepository repository) {
		
		// Compute Statistics
		HashMap<String, Integer> data = new HashMap<>();
		for (var record: recordsList)
		{
			for (var author: record.getAuthors())
			{
				var authorCompleteName = author.getCompleteName();
				int recordsNum = 0;
				if (data.containsKey(authorCompleteName))
				{
					recordsNum = data.get(authorCompleteName);					
				}
				recordsNum += 1;
				data.put(authorCompleteName, recordsNum);
			}
		}
		
		// Add to DB
		repository.deleteAll();
		for (var entry: data.entrySet())
		{
			var authorName = entry.getKey();
			var recordsNum = entry.getValue();
			repository.save(new RecordsXAuthor(authorName, recordsNum));
		}
	}
	
	// Compute numberOfRecordsPerORCIDAuthor Statistics
	private void numberOfRecordsPerORCIDAuthorComputator(ArrayList<TaskRecord> recordsList,
			RecordsXORCIDAuthorRepository repository) {
		
		// Compute Statistics
		HashMap<String, Integer> data = new HashMap<>();
		for (var record: recordsList)
		{
			for (var author: record.getAuthors())
			{
				var authorORCID = author.getORCID();
				if (authorORCID != null)
				{
					int recordsNum = 0;
					if (data.containsKey(authorORCID))
					{
						recordsNum = data.get(authorORCID);					
					}
					recordsNum += 1;
					data.put(authorORCID, recordsNum);
				}
			}
		}
		
		// Add to DB
		repository.deleteAll();
		for (var entry: data.entrySet())
		{
			var authorName = entry.getKey();
			var recordsNum = entry.getValue();
			repository.save(new RecordsXORCIDAuthor(authorName, recordsNum));
		}
	}
	
	// Compute numberOfRecordsPerPublicationYear Statistics
	private void numberOfRecordsPerPublicationYearComputator(ArrayList<TaskRecord> recordsList,
			RecordsXPublicationYearRepository repository) {
		
		// Compute Statistics
		HashMap<Integer, Integer> data = new HashMap<>();
		for (var record: recordsList)
		{
			Integer publicationYear = record.getPublicationYear();
			int recordsNum = 0;
			if (data.containsKey(publicationYear))
			{
				recordsNum = data.get(publicationYear);					
			}
			recordsNum += 1;
			data.put(publicationYear, recordsNum);			
		}
		
		// Add to DB
		repository.deleteAll();
		for (var entry: data.entrySet())
		{
			var publicationYear = entry.getKey();
			var recordsNum = entry.getValue();
			repository.save(new RecordsXPublicationYear(publicationYear, recordsNum));
		}
	}
	
	// Compute numberOfRecordsPerTypology Statistics
	private void numberOfRecordsPerTypologyComputator(ArrayList<TaskRecord> recordsList,
			RecordsXTypologyRepository repository) {
		
		// Compute Statistics
		HashMap<String, Integer> data = new HashMap<>();
		for (var record: recordsList)
		{
			String typology = record.getRecordTypology();
			int recordsNum = 0;
			if (data.containsKey(typology))
			{
				recordsNum = data.get(typology);					
			}
			recordsNum += 1;
			data.put(typology, recordsNum);			
		}
		
		// Add to DB
		repository.deleteAll();
		for (var entry: data.entrySet())
		{
			var typology = entry.getKey();
			var recordsNum = entry.getValue();
			repository.save(new RecordsXTypology(typology, recordsNum));
		}
	}
	
	// Compute numberOfJournalRecordsPerPublicationYear Statistics
	private void numberOfJournalRecordsPerPublicationYearComputator(ArrayList<TaskRecord> recordsList,
			RecordsJournalsXPublicationYearRepository repository) {
		
		// Compute Statistics
		HashMap<Integer, Integer> data = new HashMap<>();
		for (var record: recordsList)
		{
			Integer publicationYear = record.getPublicationYear();
			String typology = record.getRecordTypology().toUpperCase();
			if (typology.contains("JOURNAL"))
			{
				int recordsNum = 0;
				if (data.containsKey(publicationYear))
				{
					recordsNum = data.get(publicationYear);					
				}
				recordsNum += 1;
				data.put(publicationYear, recordsNum);
			}
		}
		
		// Add to DB
		repository.deleteAll();
		for (var entry: data.entrySet())
		{
			var publicationYear = entry.getKey();
			var recordsNum = entry.getValue();
			repository.save(new RecordsJournalsXPublicationYear(publicationYear, recordsNum));
		}
				
	}

}
