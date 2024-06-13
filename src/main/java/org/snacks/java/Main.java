package org.snacks.java;

public class Main {

	public static void main(String[] args) {
		
		//istanza e utilizzo  classe Studente
		Studente studente = new Studente ("Ajeje", "Brazorf", 33);
		
		System.out.println(studente.getAllData());
		
		
		
		//istanza e utilizzo della classe ContoBancario
		ContoBancario conto = new ContoBancario(100);
		
		System.out.println(conto.getBalance());
		
		conto.setSchei(1001.1);
		
		conto.leaveSchei (100.2);
		
		System.out.println(conto.getSchei());

	}

}
