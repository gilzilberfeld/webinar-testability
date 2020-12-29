package testingil.webinar.testability.ex4;

public class SuperbAdder {
	private int temporaryResult=0;
	private StoreHandler handler;
	
	public SuperbAdder(StoreHandler store) {
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
