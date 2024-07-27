package org.snacks.java;

import java.util.*;

public class ConfrontaElementi {

	public static void main(String[] args) {
		
		Set<String> elements1 = new HashSet<>();
		Set<String> elements2 = new HashSet<>();
		
		elements1.add("tizio");
		elements1.add("caio");
		elements1.add("sempronio");
		
		elements2.add("Caio");
		elements2.add("Sempronio");
		elements2.add("Tizio");
		
		System.out.println(haveSameElements(elements1, elements2)); // mi aspetto true
		
		elements2.add("Altro");
		
		System.out.println(haveSameElements(elements1, elements2)); // mi aspetto false dopo l'aggiunta di un nuovo elemento

	}
	
	public static boolean haveSameElements(Set<String> stack1, Set<String> stack2) {
		
		if (stack1.size() != stack2.size()) return false;
		
		int count = 0;
		// dichiarazione primo iterator
		Iterator<String> it1 = stack1.iterator();
		// nested while
		while (it1.hasNext()) {
			String element = it1.next();
			// dichiarazione nuovo iterator per il secondo set
			Iterator<String> it2 = stack2.iterator();
			while (it2.hasNext()) {
				if (element.toLowerCase().equals(it2.next().toLowerCase())) {
					count++;					
			    }				
			}	
		}
		
		if (count == stack1.size()) {
			return true;
		}
		else return false;
		
	}

}
