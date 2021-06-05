package testingil.webinar.testability.ex1.duplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import testingil.webinar.testability.Utils;

@SpringBootTest
@AutoConfigureMockMvc
class AdderServiceTests {

	@Test
	@DisplayName("First service path")
	void single_adder_() throws Exception {
		String result = Utils.postUrl("/adder/add", "3");
		assertThat(result, is("3"));
	}

	@Test
	@DisplayName("Cover both paths")
	void test_second() throws Exception {
		String result = Utils.postUrl("/adder2/addTwo", "3", "5");
		assertThat(result, is("8"));

	}

}
