package org.snacks.java;

public class RegistroStudenti {
	private Studente[] students;
	
	public RegistroStudenti() {
		this.students = new Studente[0];
	}
	
	public void addStudent(Studente newStudent) {
		Studente[] newStudents = new Studente[this.students.length + 1];
		for (int i = 0; i < this.students.length; i++) {
			newStudents[i] = this.students[i];
		}
        newStudents[this.students.length] = newStudent;    
        this.students = newStudents;
	}
	
	public void getStudents() {
		System.out.println("Registro Studenti: \n");
		for (int i = 0; i < this.students.length; i++) {
			System.out.println(students[i].getStudentInfo());
		}
	}
}
