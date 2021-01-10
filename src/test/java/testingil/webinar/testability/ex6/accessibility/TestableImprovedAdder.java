package testingil.webinar.testability.ex6.accessibility;

import testingil.webinar.testability.ex6.accessibility.LegendaryAdder;

public class TestableImprovedAdder extends LegendaryAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
