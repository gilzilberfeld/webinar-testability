package testingil.webinar.testability.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import testingil.webinar.testability.ex2.internal.AdderLogic;
import testingil.webinar.testability.ex2.internal.PowerInfo;
import testingil.webinar.testability.ex2.internal.PowerLogic;

@Component
public class Calculator {

	int currentResult = 0;
	
	@Autowired
	private AdderLogic adderLogic;

	@Autowired
	private PowerInfo powerInfo;

	@Autowired
	private PowerLogic powerLogic;

	public void add(int data) {
		adderLogic.add(data);
		currentResult = adderLogic.result;
	}

	public int getResult() {
		return currentResult;
	}
	
	public void doSomethingWithBAndC() {
		powerLogic.toThePower(currentResult, powerInfo.getPower());
		currentResult = powerLogic.result;
	}

}
