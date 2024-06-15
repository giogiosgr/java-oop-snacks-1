package org.snacks.java;

public class Main {

	public static void main(String[] args) {
		
		//istanza e utilizzo della classe Studente
		Studente studente1 = new Studente("Ajeje", "Brazorf", 33);
		System.out.println(studente1.getStudentInfo() + "\n");
		Studente studente2 = new Studente("Anakin", "Skywalker", 33);
		System.out.println(studente2.getStudentInfo() + "\n");
		
		//istanza e utilizzo della classe ContoBancario
		ContoBancario conto101 = new ContoBancario(101);
		System.out.println("Il saldo iniziale del conto numero " + conto101.getNumber() + " è di: " + conto101.getHumanBalance() + "€" + "\n");
		conto101.deposit(1001.1);
		conto101.withdraw(100.85);
		System.out.println("Il saldo residuo del conto numero " + conto101.getNumber() + " è di: " + conto101.getHumanBalance() + "€" + "\n");
		
		//istanza e utilizzo della classe RegistroStudenti
		RegistroStudenti registro = new RegistroStudenti();
		registro.addStudent (studente1);
		registro.addStudent (studente2);
		registro.getStudents();
	}	
}
	
