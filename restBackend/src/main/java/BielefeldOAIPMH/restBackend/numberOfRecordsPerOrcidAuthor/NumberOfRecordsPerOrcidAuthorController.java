package BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerOrcidAuthorController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerOrcidAuthorController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerOrcidAuthor")
	public NumberOfRecordsPerOrcidAuthor greetings()
	{
		return new NumberOfRecordsPerOrcidAuthor(counter.incrementAndGet());
	}
	
}
