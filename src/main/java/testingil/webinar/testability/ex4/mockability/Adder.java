package testingil.webinar.testability.ex4.mockability;

public class Adder {
	private int temporaryResult=0;
	private InferiorRepository repository;
	
	public Adder(InferiorRepository repository) {
		this.repository= repository;
	}
	
	private void storeAndAdd(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	

	public int getResult() {
		return temporaryResult;
	}
}
