package testingil.webinar.testability.ex3.dependencyinjection;

import testingil.webinar.testability.ex1.duplication.AdderRepository;

public class InferiorAdder {
	private int temporaryResult=0;
	private AdderRepository repository = new AdderRepository();
	
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
