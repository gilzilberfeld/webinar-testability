package testingil.webinar.testability.ex2.visibility;

public class Adder {
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
