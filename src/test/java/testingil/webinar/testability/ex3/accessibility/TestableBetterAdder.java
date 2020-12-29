package testingil.webinar.testability.ex3.accessibility;

import testingil.webinar.testability.ex3.BetterAdder;

public class TestableBetterAdder extends BetterAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
