package com.decathlon.competition;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import com.decathlon.competition.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CompetitionApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	MainController mainController;

	@Test
	void contextLoadsMain() throws Exception {
			this.mockMvc.perform(get("/"))
					.andDo(print()).andExpect(status().isOk())
					.andExpect(content().string(containsString("It is the Decathlon application. Join us!")));
	}

	@Test
	void contextLoadsResults() throws Exception {
		this.mockMvc.perform(get("/results"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Results of competitions")));
	}

	@Test
	void contextLoadsWeights() throws Exception {
		this.mockMvc.perform(get("/weights"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Coefficents (weights) of disciplines")));
	}

	@Test
	void contextLoadsCalculate() throws Exception {
		this.mockMvc.perform(get("/calculate"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Podium positions")));
	}

	@Test
	void contextLoadsDoCalculate() throws Exception {
		this.mockMvc.perform(post("/calculate"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(xpath("//div[@id='positions_list']/div").nodeCount(3));
	}

}
