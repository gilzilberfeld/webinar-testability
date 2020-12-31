package testingil.webinar.testability.ex5.duplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;
import testingil.webinar.testability.ex0.InferiorAdder;
import testingil.webinar.testability.ex0.CommonAdder;

class AdderTests {

	@Test
	@DisplayName("One code path")
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
