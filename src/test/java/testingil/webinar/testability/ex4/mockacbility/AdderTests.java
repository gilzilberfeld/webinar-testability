package testingil.webinar.testability.ex4.mockacbility;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex4.mockability.BetterRepository;
import testingil.webinar.testability.ex4.mockability.BlackAdder;
import testingil.webinar.testability.ex4.mockability.CommonAdder;
import testingil.webinar.testability.ex4.mockability.InferiorRepository;

class AdderTests{

	@Test
	@DisplayName("This one goes to the database")
	void adderTest() {
		InferiorRepository repository = new InferiorRepository();
		CommonAdder adder = new CommonAdder(repository);
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	
	@Test
	@DisplayName("This one can be mocked")
	void improvedAdderTest() {
		BetterRepository repository = mock(BetterRepository.class);
		BlackAdder adder = new BlackAdder(repository);
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
