package testingil.webinar.testability.ex0;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class InferiorAdder {
	private int temporaryResult=0;
	private PowerRepository repository = new PowerRepository();
	
	public void addTwo(int a, int b) {
		repository.storeInDB(a);
		temporaryResult +=a;
		repository.storeInDB(b);
		temporaryResult +=b;
	}
	
	public void add(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	

	public int getResult() {
		return temporaryResult;
	}
}
