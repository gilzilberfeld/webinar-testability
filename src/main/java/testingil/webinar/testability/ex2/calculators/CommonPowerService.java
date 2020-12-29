package testingil.webinar.testability.ex2.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testingil.webinar.testability.ex2.dependencies.PowerInfo;
import testingil.webinar.testability.ex2.dependencies.PowerLogic;

@Service
public class CommonPowerService {

	int currentResult = 0;

	@Autowired
	private PowerLogic powerLogic;

	@Autowired
	private PowerInfo powerInfo;
	
	public void raisePower() {
		powerLogic.toThePower(currentResult, powerInfo.getPower());
		currentResult = powerLogic.result;
	}

	public int getResult() {
		return currentResult;
	}
	

}
