package BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.numberOfRecordsPerPublicationYear.NumberOfRecordsPerPublicationYearController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfRecordsPerPublicationYearController.class)
class NumberOfRecordsPerPublicationYearTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void numberOfRecordsPerPublicationYearNoParameters() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerPublicationYear"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	}    
	
	@Test
	void numberOfRecordsPerPublicationYearNoYearRange() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerPublicationYear?startYear=1985"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	} 
	
	@Test
	void numberOfRecordsPerPublicationYearNoStartYEar() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerPublicationYear?yearRange=5"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	} 
	
	@Test
	void numberOfRecordsPerPublicationYearLoad() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfRecordsPerPublicationYear?startYear=1985&yearRange=5"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}   

}
