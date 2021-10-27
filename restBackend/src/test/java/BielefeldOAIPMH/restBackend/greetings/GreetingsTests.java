package BielefeldOAIPMH.restBackend.greetings;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import BielefeldOAIPMH.restBackend.greetings.GreetingsController;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingsController.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
class GreetingsTests 
{
	 @Autowired
	 private MockMvc mockMvc;

	@Test
	void greetingsLoads() throws Exception 
	{
		this.mockMvc.perform(MockMvcRequestBuilders.get("/greetings"))
		.andDo(MockMvcResultHandlers.print())
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcRestDocumentation.document("home"));
	}
	
	@Test
	void greetingsContent() throws Exception 
	{
		final String greetingStr = "I am the Biefield REST API";
		this.mockMvc.perform(MockMvcRequestBuilders.get("/greetings"))
        .andExpect(MockMvcResultMatchers.content()
        			.string(org.hamcrest.Matchers.containsString(greetingStr)));
	}    

}
