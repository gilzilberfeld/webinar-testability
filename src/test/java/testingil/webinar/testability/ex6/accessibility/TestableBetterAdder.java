package testingil.webinar.testability.ex6.accessibility;

public class TestableBetterAdder extends BetterAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
