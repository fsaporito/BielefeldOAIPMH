package BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerAuthorController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerAuthorController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerAuthor")
	public NumberOfRecordsPerAuthor greetings()
	{
		return new NumberOfRecordsPerAuthor(counter.incrementAndGet());
	}
	
}
