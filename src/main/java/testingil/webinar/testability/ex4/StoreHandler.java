package testingil.webinar.testability.ex4;

import testingil.webinar.testability.ex2.dependencies.PowerRepository;

public class StoreHandler {
	private PowerRepository repository;
	
	public void store(int a) {
		repository.storeInDB(a);
	}
}
