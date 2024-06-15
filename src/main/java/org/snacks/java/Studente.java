package org.snacks.java;

  class Studente {
	
	private String firstName;
	private String lastName;
	private int age;
	
	Studente(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}
	
	String getStudentInfo() {
		return this.lastName + " " + this.firstName + ", " + this.age + " anni";
	}
}
