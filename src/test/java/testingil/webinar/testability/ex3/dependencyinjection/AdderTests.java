package testingil.webinar.testability.ex3.dependencyinjection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import testingil.webinar.testability.ex1.duplication.AdderRepository;


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
		AdderRepository mockRepository = mock(AdderRepository.class);
		RareAdder adder = new RareAdder(mockRepository);
		adder.add(3, 4);
		assertThat(adder.getResult(), is(7));
	}
	

}
