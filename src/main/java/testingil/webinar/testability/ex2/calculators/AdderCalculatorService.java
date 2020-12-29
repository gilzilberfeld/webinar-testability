package testingil.webinar.testability.ex2.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import testingil.webinar.testability.ex2.dependencies.AdderLogic;

@Component
public class AdderCalculatorService {

	int currentResult = 0;
	
	@Autowired
	private AdderLogic adderLogic;
	
	public void add(int data) {
		adderLogic.add(data);
		currentResult = adderLogic.result;
	}

	public int getResult() {
		return currentResult;
	}

}
