package testingil.webinar.testability.ex1;

public class InferiorAdder {
	private int temporaryResult=0;
	
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	private void storeAndAdd(int a) {
		temporaryResult +=a;
	}

	public int getResult() {
		return temporaryResult;
	}
}
