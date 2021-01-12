package testingil.webinar.testability.ex1.duplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdderTests {

	@Test
	@DisplayName("First code path")
	void adderTest_1() {
		Adder adder = new Adder();
		adder.add(3);
		assertThat(adder.getResult(), is(3));
	}
	
	@Test
	@DisplayName("Second code path")
	void adderTest_2() {
		Adder adder = new Adder();
		adder.addTwo(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("Covers both")
	void betterAdderTest() {
		BetterAdder adder = new BetterAdder();
		adder.addTwo(3, 4);
		assertThat(adder.getResult(), is(7));
	}

}
