package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXPublicationYearRepository;

@RestController
public class NumberOfRecordsPerPublicationYearController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RecordsXPublicationYearRepository recordsXPublicationYearRepository;
	
	public NumberOfRecordsPerPublicationYearController() 
	{}		
		
	@GetMapping("/numberOfRecordsPerPublicationYear")
	public NumberOfRecordsPerPublicationYear numberOfRecordsPerPublicationYear()
	{
		var records = recordsXPublicationYearRepository.findAll();
		HashMap<String, String> data = new HashMap<>();
		for (var record: records)
		{
			data.put(Integer.toString(record.getPublicationYear()), 
					 Integer.toString(record.getRecordNum()));
		}
		return new NumberOfRecordsPerPublicationYear(counter.incrementAndGet(), data);
	}
	
}
