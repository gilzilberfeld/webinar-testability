package testingil.webinar.testability.ex6.accessibility;

public class TestableImprovedAdder extends LegendaryAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
