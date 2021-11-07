package BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerTypologyController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerTypologyController() 
	{}
		
	@GetMapping("/numberOfRecordsPerTypology")
	public NumberOfRecordsPerTypology numberOfRecordsPerTypology()
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("NumberOfRecordsPerTypology_KEY1", "VALUE1");
		data.put("NumberOfRecordsPerTypology_KEY2", "VALUE2");
		return new NumberOfRecordsPerTypology(counter.incrementAndGet(), data);
	}
	
}
