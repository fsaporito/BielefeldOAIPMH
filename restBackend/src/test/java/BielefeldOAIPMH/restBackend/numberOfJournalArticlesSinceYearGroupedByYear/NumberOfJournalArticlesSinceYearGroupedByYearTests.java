package BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGroupedByYear;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.numberOfJournalArticlesSinceYearGrouped.NumberOfJournalArticlesSinceYearGroupedByYearController;

@RunWith(SpringRunner.class)
@WebMvcTest(NumberOfJournalArticlesSinceYearGroupedByYearController.class)
class NumberOfJournalArticlesSinceYearGroupedByYearTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void numberOfRecordsPerPublicationYearNoParameters() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfJournalRecordsSinceYearGrouperByYear"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	}    
	
	@Test
	void numberOfRecordsPerPublicationYearNoYearRange() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfJournalRecordsSinceYearGrouperByYear?startYear=1985"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	} 
	
	@Test
	void numberOfRecordsPerPublicationYearNoStartYEar() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfJournalRecordsSinceYearGrouperByYear?yearRange=5"))
        .andExpect(MockMvcResultMatchers.status().is4xxClientError());
	} 
	
	@Test
	void numberOfRecordsPerPublicationYearLoad() throws Exception
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/numberOfJournalRecordsSinceYearGrouperByYear?startYear=1985&yearRange=5"))
        .andExpect(MockMvcResultMatchers.status().isOk());
	}   

}
