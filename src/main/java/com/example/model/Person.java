package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "jai")
@Data
@Getter
@Setter
public class Person {
	@org.springframework.data.annotation.Id
	private String Id;
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String lastName;
	private int age;

	public Person(String fname, String lname, int age) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}

	public String toString() {
		return "Person FirstName" + firstName + "LastName" + lastName + "age" + age;
	}
}
