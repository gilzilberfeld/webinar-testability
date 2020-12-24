package testingil.webinar.testability.ex2.internal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerInfo {
	
	@Autowired 
	private PowerRepository repository;
	
	public int getPower() {
		return repository.getFromDB();
	}

}
