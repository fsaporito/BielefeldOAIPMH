package BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerOrcidAuthorController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerOrcidAuthorController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerOrcidAuthor")
	public NumberOfRecordsPerOrcidAuthor numberOfRecordsPerOrcidAuthor()
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("NumberOfRecordsPerOrcidAuthor_KEY1", "VALUE1");
		data.put("NumberOfRecordsPerOrcidAuthor_KEY2", "VALUE2");
		return new NumberOfRecordsPerOrcidAuthor(counter.incrementAndGet(), data);
	}
	
}
