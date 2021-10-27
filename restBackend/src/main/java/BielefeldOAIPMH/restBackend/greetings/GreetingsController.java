package BielefeldOAIPMH.restBackend.greetings;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	private final AtomicLong counter = new AtomicLong();
	
	public GreetingsController() 
	{}		
		
	@GetMapping("/greetings")
	public Greetings greetings()
	{
		return new Greetings(counter.incrementAndGet());
	}
	
}
