package testingil.webinar.testability.ex1.duplication;

import testingil.webinar.testability.ex5.modularity.dependencies.PowerRepository;

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
