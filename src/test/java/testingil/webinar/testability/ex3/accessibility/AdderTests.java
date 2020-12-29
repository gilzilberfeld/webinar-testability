package testingil.webinar.testability.ex3.accessibility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex3.Adder;
import testingil.webinar.testability.ex3.BetterAdder;

class AdderTests{

	@Test
	@DisplayName("This one goes to the database")
	void adderTest() {
		Adder adder = new Adder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("This one doesn't")
	void betterAdderTest() {
		BetterAdder adder = new TestableBetterAdder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
