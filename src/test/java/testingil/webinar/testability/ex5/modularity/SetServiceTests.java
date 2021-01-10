package testingil.webinar.testability.ex5.modularity;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testingil.webinar.testability.ex5.modularity.calculators.SetService;
import testingil.webinar.testability.ex5.modularity.dependencies.AdderLogic;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerInfo;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerLogic;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerRepository;

@SpringBootTest
class SetServiceTests {

	@Autowired
	public SetService calc;

	@Configuration
	static class ContextConfiguration {

		@Bean
		public SetService calculator() {
			return new SetService();
		}

		@Bean
		public AdderLogic adderLogic() {
			return new AdderLogic();
		}

		@Bean
		public PowerInfo powerInfo() {
			return mock(PowerInfo.class);
		}

		@Bean
		public PowerLogic powerLogic() {
			return mock(PowerLogic.class);
		}

		@Bean
		public PowerRepository powerRepository() {
			return mock(PowerRepository.class);
		}

	}

	@Test
	@DisplayName("Requires many dependencies that it doesn't need")
	void calculator_with_many_dependencies() {
		calc.add(2);
		assertThat(calc.getResult(), is(2));
	}

}