package edu.austincc.managers;

import java.util.ArrayList;

import edu.austincc.domain.Person;

public class PeopleManager {
	private ArrayList<Person> people;

	public PeopleManager() {
		super();
		
		people = new ArrayList<Person>();
		
		people.add(new Person("Sam", 47));
		people.add(new Person("Bill", 15));
		people.add(new Person("Sally", 56));
		people.add(new Person("Junita", 22));
	}

	// Getters and Setters
	public ArrayList<Person> getPeople() {
		return people;
	}
	
}
