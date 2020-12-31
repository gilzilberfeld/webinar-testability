package testingil.webinar.testability.ex5.dependencyinjection;

import testingil.webinar.testability.ex3.modularity.dependencies.PowerRepository;

public class RareAdder {
	private int temporaryResult=0;
	private PowerRepository repository;
	
	public void store(int a) {
		repository.storeInDB(a);
	}
		
	public RareAdder(PowerRepository rep) {
		this.repository= rep;
	}

	public void add(int a, int b) {
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
