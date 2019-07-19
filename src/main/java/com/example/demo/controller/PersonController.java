package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PersonService;
import com.example.model.Person;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String create(@RequestParam String fname, @RequestParam String lname, @RequestParam int age) {
		Person p = personService.create(fname, lname, age);
		return p.toString();
	}

	@RequestMapping("/get")
	public Person get(@RequestParam String fname) {
		return personService.getByName(fname);
	}

	@RequestMapping("/getAll")
	public List<Person> getAll(@RequestParam String fname) {
		return personService.getAll();
	}

	@RequestMapping("/update")
	public String update(@RequestParam String fname, @RequestParam String lname, @RequestParam int age) {
		Person p = personService.update(fname, lname, age);
		return p.toString();
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam String fname) {
		personService.deleteperson(fname);
		return "deleted the record "+fname;
	}

	@RequestMapping("/deleteAll")
	public String deleteAll() {
		personService.deleteAll();
		return "deleted the record all";
	}
}
