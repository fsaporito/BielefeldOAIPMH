package BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXAuthorRepository;

@RestController
public class NumberOfRecordsPerAuthorController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RecordsXAuthorRepository recordsXAuthorRepository;
	
	public NumberOfRecordsPerAuthorController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerAuthor")
	public NumberOfRecordsPerAuthor numberOfRecordsPerAuthor()
	{
		var records = recordsXAuthorRepository.findAll();
		HashMap<String, String> data = new HashMap<String, String>();
		for (var record: records)
		{
			data.put(record.getAuthorName(), Integer.toString(record.getRecordNum()));
		}
		return new NumberOfRecordsPerAuthor(counter.incrementAndGet(), data);
	}
	
}
