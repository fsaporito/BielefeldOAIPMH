package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped;

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
		return new NumberOfJournalArticlesSinceYearGroupedByYear(counter.incrementAndGet(), startYear, yearRange);
	}
	
}
