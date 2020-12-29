package testingil.webinar.testability.ex2.modularization;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testingil.webinar.testability.ex2.calculators.SuperCalculatorService;
import testingil.webinar.testability.ex2.dependencies.AdderLogic;
import testingil.webinar.testability.ex2.dependencies.PowerInfo;
import testingil.webinar.testability.ex2.dependencies.PowerLogic;
import testingil.webinar.testability.ex2.dependencies.PowerRepository;

@SpringBootTest
class CalculatorTests_1 {

	@Autowired
	public SuperCalculatorService calc;

	@Configuration
	static class ContextConfiguration {

		@Bean
		public SuperCalculatorService calculator() {
			return new SuperCalculatorService();
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