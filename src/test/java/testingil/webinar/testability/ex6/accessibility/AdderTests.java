package testingil.webinar.testability.ex6.accessibility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdderTests{

	@Test
	@DisplayName("This one goes to the database")
	void adder_Test() {
		Adder adder = new Adder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("This one doesn't")
	void betterAdder_Test() {
		BetterAdder adder = new TestableBetterAdder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
