package testingil.webinar.testability.ex6.accessibility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex6.accessibility.CommonAdder;
import testingil.webinar.testability.ex6.accessibility.LegendaryAdder;

class AdderTests{

	@Test
	@DisplayName("This one goes to the database")
	void adderTest() {
		CommonAdder adder = new CommonAdder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("This one doesn't")
	void improvedAdderTest() {
		LegendaryAdder adder = new TestableImprovedAdder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
