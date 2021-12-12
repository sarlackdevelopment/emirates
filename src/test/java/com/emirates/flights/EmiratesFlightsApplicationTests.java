package com.emirates.flights;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import com.emirates.flights.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class EmiratesFlightsApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	MainController mainController;

	@Test
	void contextLoadsMain() throws Exception {
			this.mockMvc.perform(get("/"))
					.andDo(print()).andExpect(status().isOk())
					.andExpect(content().string(containsString("Emirates")));
	}

	@Test
	void contextLoadsResults() throws Exception {
		this.mockMvc.perform(get("/flight"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Flight info")));
	}

}
