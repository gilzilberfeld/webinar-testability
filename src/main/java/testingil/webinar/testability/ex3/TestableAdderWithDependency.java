package testingil.webinar.testability.ex3;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class TestableAdderWithDependency {
	private int temporaryResult=0;
	private StoreHandler handler;
	
	public TestableAdderWithDependency(StoreHandler store) {
		this.handler = store;
	}
	
		
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	private void storeAndAdd(int a) {
		handler.store(a);
		temporaryResult +=a;
	}

	public int getResult() {
		return temporaryResult;
	}
}
