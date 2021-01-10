package testingil.webinar.testability.ex5.modularity.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testingil.webinar.testability.ex5.modularity.dependencies.AdderLogic;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerInfo;
import testingil.webinar.testability.ex5.modularity.dependencies.PowerLogic;

@Service
public class SetService {

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
	
	public void raisePower() {
		powerLogic.toThePower(currentResult, powerInfo.getPower());
		currentResult = powerLogic.result;
	}

}
