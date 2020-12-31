package testingil.webinar.testability.ex1.duplication;

import testingil.webinar.testability.ex3.modularity.dependencies.PowerRepository;

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
