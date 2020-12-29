package testingil.webinar.testability.ex3.accessibility;

import testingil.webinar.testability.ex3.ImprovedAdder;

public class TestableImprovedAdder extends ImprovedAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
