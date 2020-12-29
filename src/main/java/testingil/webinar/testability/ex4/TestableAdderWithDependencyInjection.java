package testingil.webinar.testability.ex4;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class TestableAdderWithDependencyInjection {
	private int temporaryResult=0;
	private StoreHandler handler;
	
	public TestableAdderWithDependencyInjection(StoreHandler store) {
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
