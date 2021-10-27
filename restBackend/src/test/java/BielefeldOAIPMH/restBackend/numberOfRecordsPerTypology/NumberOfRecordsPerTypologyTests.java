package BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.numberOfRecordsPerTypology.NumberOfRecordsPerTypologyController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfRecordsPerTypologyController.class)
class NumberOfRecordsPerTypologyTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void numberOfRecordsPerTypologyLoads() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerTypology"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}    

}
