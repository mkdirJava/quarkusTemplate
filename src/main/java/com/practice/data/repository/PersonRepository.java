package com.practice.data.repository;

import javax.enterprise.context.ApplicationScoped;

import com.practice.data.model.Person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person>{
	
	

}
