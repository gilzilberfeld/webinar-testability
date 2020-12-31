package testingil.webinar.testability.ex0;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class CommonAdder {
	private int temporaryResult=0;
	private PowerRepository repository = new PowerRepository();
	
	public void addTwo(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	public void add(int a) {
		storeAndAdd(a);
	}
	
	private void storeAndAdd(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	

	public int getResult() {
		return temporaryResult;
	}
}
