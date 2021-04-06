package testingil.webinar.testability;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class Utils {
	
	@Autowired
	static MockMvc mockMvc;

	public static String postUrl(String url, String param1) throws Exception {
		return postUrl(url, param1, "");
	}
	
	public static String postUrl(String url, String param1, String param2) throws Exception {
		return mockMvc.perform(post(url)
				.queryParam("param1", param1)
				.queryParam("param2", param2))
				.andExpect(status().isOk())
				.andReturn().getResponse().getContentAsString();
	}
	
	public static String getUrl(String url) throws Exception {
		return mockMvc.perform(get(url))
				.andExpect(status().isOk())
				.andReturn().getResponse().getContentAsString();
	}

}
