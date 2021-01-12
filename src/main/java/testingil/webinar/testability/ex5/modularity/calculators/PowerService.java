package testingil.webinar.testability.ex5.modularity.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testingil.webinar.testability.ex5.modularity.dependencies.PowerInfo;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerLogic;

@Service
public class PowerService {

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
