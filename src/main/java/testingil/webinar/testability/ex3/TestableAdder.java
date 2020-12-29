package testingil.webinar.testability.ex3;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class TestableAdder {
	protected int temporaryResult=0;
	private PowerRepository repository;
	
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
