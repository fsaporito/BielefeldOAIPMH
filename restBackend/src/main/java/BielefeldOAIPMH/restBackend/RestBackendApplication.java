package BielefeldOAIPMH.restBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBackendApplication.class, args);
	}

}
