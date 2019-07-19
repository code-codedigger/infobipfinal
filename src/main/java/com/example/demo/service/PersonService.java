/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.PersonRepository;
import com.example.model.Person;

/**
 * @author suresh
 *
 */
@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person create(String fname, String lname, int age) {
		return personRepository.save(new Person(fname, lname, age));
	}

	public List<Person> getAll() {
		return personRepository.findAll();
	}

	public Person getByName(String fName) {
		return personRepository.findByFirstName(fName);
	}

	public Person update(String fname, String lName, int age) {
		Person p = personRepository.findByFirstName(fname);
		p.setLastName(lName);
		p.setAge(age);
		return personRepository.save(p);
	}

	public void deleteAll() {
		personRepository.deleteAll();
	}

	public void deleteperson(String fname) {
		personRepository.delete(personRepository.findByFirstName(fname));
	}
}
