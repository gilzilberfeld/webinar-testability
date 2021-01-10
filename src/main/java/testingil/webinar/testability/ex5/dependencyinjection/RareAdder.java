package testingil.webinar.testability.ex5.dependencyinjection;

import testingil.webinar.testability.ex3.modularity.dependencies.PowerRepository;
import testingil.webinar.testability.ex6.accessibility.AdderRepository;

public class RareAdder {
	private int temporaryResult=0;
	private AdderRepository repository;
	
	public RareAdder(AdderRepository rep) {
		this.repository= rep;
	}
	
	public void store(int a) {
		repository.storeInDB(a);
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
