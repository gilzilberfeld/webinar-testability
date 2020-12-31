package testingil.webinar.testability.ex4.accessibility;

public class TestableImprovedAdder extends LegendaryAdder {

	@Override
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}
}
