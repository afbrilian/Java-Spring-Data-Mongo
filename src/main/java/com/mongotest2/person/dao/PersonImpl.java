package com.mongotest2.person.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongotest2.person.model.Person;
import com.mongotest2.person.repositories.PersonRepository;

@Service
public class PersonImpl implements PersonDao {
	
	@Autowired
	private PersonRepository repository; 
	
	public void save(String name, String homeTown, int age) {
		Person person = new Person(name, homeTown, age);
		repository.save(person);
	}
	
	public List<Person> findAll(){
		List<Person> persons = repository.findAll();
		return persons;
	}

	public List<Person> findByNameIgnoreCase(String name) {
		List<Person> persons = repository.findByNameIgnoreCase(name);
		return persons;
	}

	public void cleanCollections() {
		repository.deleteAll();
	}

}
