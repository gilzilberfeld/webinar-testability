package testingil.webinar.testability.ex4.di;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;
import testingil.webinar.testability.ex4.InferiorAdder;
import testingil.webinar.testability.ex4.RareAdder;

class AdderTests {

	@Test
	@DisplayName("This one goes to the database")
	void adderTest() {
		InferiorAdder adder = new InferiorAdder();
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("This one definitely doesn't")
	void improvedAdderTest() {
		PowerRepository mockRepository = mock(PowerRepository.class);
		RareAdder adder = new RareAdder(mockRepository);
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
