package testingil.webinar.testability.ex1.duplication;

public class Adder {
	private int temporaryResult=0;
	private AdderRepository repository = new AdderRepository();
	
	public void add(int a) {
		repository.storeInDB(a);
		temporaryResult +=a;
	}
	
	public void addTwo(int a, int b) {
		repository.storeInDB(a);
		temporaryResult +=a;
		repository.storeInDB(b);
		temporaryResult +=b;
	}


	public int getResult() {
		return temporaryResult;
	}
}
