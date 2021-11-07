package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfJournalArticlesSinceYearGroupedByYearController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfJournalArticlesSinceYearGroupedByYearController() 
	{}		
		
	@GetMapping("/numberOfJournalRecordsSinceYearGrouperByYear")
	public NumberOfJournalArticlesSinceYearGroupedByYear greetings(@RequestParam(name = "startYear") int startYear,
			@RequestParam(name = "yearRange") int yearRange)
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("NumberOfJournalArticlesSinceYearGroupedByYear_KEY1", "VALUE1");
		data.put("NumberOfJournalArticlesSinceYearGroupedByYear_KEY2", "VALUE2");
		return new NumberOfJournalArticlesSinceYearGroupedByYear(counter.incrementAndGet(), startYear, yearRange, data);
	}
	
}
