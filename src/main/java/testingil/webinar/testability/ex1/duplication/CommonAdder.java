package testingil.webinar.testability.ex1.duplication;

public class CommonAdder {
	private int temporaryResult=0;
	private AdderRepository repository = new AdderRepository();
	
	public void addTwo(int a, int b) {
		storeAndAdd(a);
		storeAndAdd(b);
	}
	
	public void add(int a) {
		storeAndAdd(a);
	}
	
	private void storeAndAdd(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	

	public int getResult() {
		return temporaryResult;
	}
}
