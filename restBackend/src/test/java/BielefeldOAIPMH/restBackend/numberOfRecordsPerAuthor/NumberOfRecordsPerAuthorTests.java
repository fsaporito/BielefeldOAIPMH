package BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.numberOfRecordsPerAuthor.NumberOfRecordsPerAuthorController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfRecordsPerAuthorController.class)
class NumberOfRecordsPerAuthorTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void numberOfRecordsPerAuthorLoads() throws Exception 
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerAuthor"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}    

}
