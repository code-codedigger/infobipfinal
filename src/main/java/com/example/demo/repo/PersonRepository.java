package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
	public Person findByFirstName(String name);
	public List<Person> findByAge(int age);

}
