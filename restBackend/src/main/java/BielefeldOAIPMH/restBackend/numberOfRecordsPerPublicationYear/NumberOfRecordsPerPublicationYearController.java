package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerPublicationYearController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerPublicationYearController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerPublicationYear")
	public NumberOfRecordsPerPublicationYear greetings(@RequestParam(name = "startYear") int startYear,
			@RequestParam(name = "yearRange") int yearRange)
	{
		return new NumberOfRecordsPerPublicationYear(counter.incrementAndGet(), startYear, yearRange);
	}
	
}
