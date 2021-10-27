package BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.numberOfRecordsPerOrcidAuthor.NumberOfRecordsPerOrcidAuthorController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfRecordsPerOrcidAuthorController.class)
class NumberOfRecordsPerOrcidAuthorTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void numberOfRecordsPerOrcidAuthorLoads() throws Exception 
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerOrcidAuthor"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}    

}
