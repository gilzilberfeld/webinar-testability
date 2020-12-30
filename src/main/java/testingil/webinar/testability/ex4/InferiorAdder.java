package testingil.webinar.testability.ex4;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class InferiorAdder {
	private int temporaryResult=0;
	private PowerRepository repository = new PowerRepository();
	
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	private void storeAndAdd(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	

	public int getResult() {
		return temporaryResult;
	}
}
