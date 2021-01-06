package testingil.webinar.testability.ex1.duplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdderTests {

	@Test
	@DisplayName("First code path")
	void inferiorAdderTest_1() {
		InferiorAdder adder = new InferiorAdder();
		adder.add(3);
		assertThat(adder.getResult(), is(3));
	}
	
	@Test
	@DisplayName("Second code path")
	void inferiorAdder_2() {
		InferiorAdder adder = new InferiorAdder();
		adder.addTwo(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("Covers both")
	void improvedAdderTest() {
		CommonAdder adder = new CommonAdder();
		adder.addTwo(3, 4);
		assertThat(adder.getResult(), is(7));
	}

}
