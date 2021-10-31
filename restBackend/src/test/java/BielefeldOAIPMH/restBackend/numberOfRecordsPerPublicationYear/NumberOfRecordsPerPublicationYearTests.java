package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfRecordsPerPublicationYearController.class)
class NumberOfRecordsPerPublicationYearTests
{
	 @Autowired
	 private MockMvc mockMvc;

	
	@Test
	void numberOfRecordsPerPublicationYearTestsLoad() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerPublicationYear"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}   

}
