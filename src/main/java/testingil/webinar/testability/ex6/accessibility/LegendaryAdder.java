package testingil.webinar.testability.ex6.accessibility;

public class LegendaryAdder {
	protected int temporaryResult=0;
	private AdderRepository repository = new AdderRepository();
	
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	protected void storeAndAdd(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}

	public int getResult() {
		return temporaryResult;
	}
}
