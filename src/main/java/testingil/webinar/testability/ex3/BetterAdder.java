package testingil.webinar.testability.ex3;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class BetterAdder {
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
