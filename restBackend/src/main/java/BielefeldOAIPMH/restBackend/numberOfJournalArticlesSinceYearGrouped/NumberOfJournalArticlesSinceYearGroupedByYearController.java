package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BielefeldOAIPMH.restBackend.jpaEntities.RecordsJournalsXPublicationYearRepository;

@RestController
public class NumberOfJournalArticlesSinceYearGroupedByYearController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RecordsJournalsXPublicationYearRepository recordsJournalsXPublicationYearRepository;
	
	public NumberOfJournalArticlesSinceYearGroupedByYearController() 
	{}		
		
	@GetMapping("/numberOfJournalRecordsSinceYearGrouperByYear")
	public NumberOfJournalArticlesSinceYearGroupedByYear numberOfJournalRecordsSinceYearGrouperByYear(@RequestParam(name = "startYear") int startYear,
			@RequestParam(name = "yearRange") int yearRange)
	{
		var records = recordsJournalsXPublicationYearRepository.findAll();
		HashMap<Integer, Integer> data = new HashMap<>();
		for (var record: records)
		{
			data.put(record.getPublicationYear(), record.getRecordNum());
		}
		return new NumberOfJournalArticlesSinceYearGroupedByYear(counter.incrementAndGet(), startYear, yearRange, data);
	}
	
}
