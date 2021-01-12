package testingil.webinar.testability.ex2.visibility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdderTests {

	@Test
	@DisplayName("Can check only end state")
	void adder_test() {
		Adder adder = new Adder();
		adder.add(4, 5);
		assertThat(adder.getResult(), is(9));
	}

	@Test
	@DisplayName("Can check internal state")
	void betteradder_test() {
		BetterAdder adder = new BetterAdder();
		adder.storeAndAdd(3);
		assertThat(adder.getResult(), is(3));
	}

}
