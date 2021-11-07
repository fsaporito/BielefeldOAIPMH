package BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXAuthorRepository;
import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXORCIDAuthorRepository;

@RestController
public class NumberOfRecordsPerOrcidAuthorController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RecordsXORCIDAuthorRepository recordsXORCIDAuthorRepository;
	
	public NumberOfRecordsPerOrcidAuthorController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerOrcidAuthor")
	public NumberOfRecordsPerOrcidAuthor numberOfRecordsPerOrcidAuthor()
	{
		var records = recordsXORCIDAuthorRepository.findAll();
		HashMap<String, String> data = new HashMap<>();
		for (var record: records)
		{
			data.put(record.getAuthorORCID(), Integer.toString(record.getRecordNum()));
		}
		return new NumberOfRecordsPerOrcidAuthor(counter.incrementAndGet(), data);
	}
	
}
