package testingil.webinar.testability.ex3.accessibility;

import testingil.webinar.testability.ex3.LegendaryAdder;

public class TestableImprovedAdder extends LegendaryAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
