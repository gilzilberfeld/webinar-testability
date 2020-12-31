package testingil.webinar.testability.ex3.modularity.calculators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testingil.webinar.testability.ex3.modularity.dependencies.AdderLogic;

@Service
public class CommonAdderService {

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
