package BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import BielefeldOAIPMH.restBackend.jpaEntities.RecordsXTypologyRepository;

@RestController
public class NumberOfRecordsPerTypologyController {

	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private RecordsXTypologyRepository recordsXTypologyRepository;
	
	public NumberOfRecordsPerTypologyController()
	{}
		
	@GetMapping("/numberOfRecordsPerTypology")
	public NumberOfRecordsPerTypology numberOfRecordsPerTypology()
	{
		var records = recordsXTypologyRepository.findAll();
		HashMap<String, String> data = new HashMap<>();
		for (var record: records)
		{
			data.put(record.getTypology(), Integer.toString(record.getRecordNum()));
		}
		return new NumberOfRecordsPerTypology(counter.incrementAndGet(), data);
	}
	
}
