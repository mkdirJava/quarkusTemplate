package com.practice.data;

import java.util.List;

import com.practice.data.model.Person;

public interface IDatabaseFacade {
	
	List<Person> getPeople();
	
	void savePerson();

}
