package testingil.webinar.testability.ex2.visibility;

public class BetterAdder {
	public int temporaryResult=0;
	
	public void add(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	public void storeAndAdd(int a) {
		temporaryResult +=a;
	}

	public int getResult() {
		return temporaryResult;
	}
}
