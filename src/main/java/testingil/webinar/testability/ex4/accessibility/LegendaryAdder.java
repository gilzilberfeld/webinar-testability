package testingil.webinar.testability.ex4.accessibility;

import testingil.webinar.testability.ex3.modularity.dependencies.PowerRepository;

public class LegendaryAdder {
	protected int temporaryResult=0;
	private PowerRepository repository = new PowerRepository();
	
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
