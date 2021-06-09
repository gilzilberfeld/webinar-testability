package testingil.webinar.testability.ex2.visibility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import testingil.webinar.testability.Utils;

@SpringBootTest
@AutoConfigureMockMvc
class AdderServiceTests {

	@Test
	@DisplayName("Can add and store but cannot read")
	void store_and() throws Exception {
		Utils.postUrl("/adder/add", "3");
		
		// this fails because there is no API
		String result = Utils.getUrl("/adder/tempResult");
		assertThat(result, is("3"));
	}
}
