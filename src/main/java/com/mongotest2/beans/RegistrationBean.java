package com.mongotest2.beans;

import com.mongotest2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationBean {
	@Autowired
	private PersonRepository repository;

	public RegistrationBean() {
	}

	public PersonRepository getRepository() {
		return repository;
	}

	public void setRepository(PersonRepository repository) {
		this.repository = repository;
	}
}
