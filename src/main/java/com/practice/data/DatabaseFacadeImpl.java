package com.practice.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.practice.data.model.Person;
import com.practice.data.repository.PersonRepository;

@ApplicationScoped
public class DatabaseFacadeImpl implements IDatabaseFacade {

	private PersonRepository personRepository;
	private Integer counter =0;
	
	@Inject
	public DatabaseFacadeImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public List<Person> getPeople() {
		return personRepository.listAll();
	}
	
	@Transactional
	public void savePerson() {
		Person person = new Person();
		person.setFirstName("bob"+ ++counter);
		person.setLastName("Bob" + counter);;
		personRepository.persist(person);
	}

}
