package org.snacks.java;

public class RegistroStudenti {
	private String[] students;
	private int index;
	
	public RegistroStudenti() {
		this.students = new String[1000];
		this.index = 0;
	}
	
	public void addStudent(String student) {
		if (!student.equals("")) {
			students[index] = student;
			index++;
		}
	}
	
	public void getStudents() {
		System.out.println("Registro Studenti: \n");
		for (int i = 0; i < index; i++) {
			System.out.println(students[i]);
		}
	}
}
