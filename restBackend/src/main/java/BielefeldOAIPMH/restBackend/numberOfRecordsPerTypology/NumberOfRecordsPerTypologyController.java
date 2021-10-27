package BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberOfRecordsPerTypologyController {

	private final AtomicLong counter = new AtomicLong();
	
	public NumberOfRecordsPerTypologyController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerTypology")
	public NumberOfRecordsPerTypology greetings()
	{
		return new NumberOfRecordsPerTypology(counter.incrementAndGet());
	}
	
}
