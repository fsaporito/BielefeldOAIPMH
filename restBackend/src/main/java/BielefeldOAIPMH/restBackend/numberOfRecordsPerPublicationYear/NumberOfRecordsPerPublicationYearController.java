package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerPublicationYearController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerPublicationYearController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerPublicationYear")
	public NumberOfRecordsPerPublicationYear numberOfRecordsPerPublicationYear()
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("NumberOfRecordsPerPublicationYear_KEY1", "VALUE1");
		data.put("NumberOfRecordsPerPublicationYear_KEY2", "VALUE2");
		return new NumberOfRecordsPerPublicationYear(counter.incrementAndGet(), data);
	}
	
}
