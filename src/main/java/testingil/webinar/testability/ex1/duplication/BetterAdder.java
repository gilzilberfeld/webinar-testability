package testingil.webinar.testability.ex1.duplication;

public class BetterAdder {
	private int temporaryResult=0;
	private AdderRepository repository = new AdderRepository();
	
	public void add(int a) {
		storeAndAdd(a);
	}

	public void addTwo(int a, int b) {
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
