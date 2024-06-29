package org.snacks.java;

import java.util.*;

public class Snack4 {
	
	static ArrayList<String> lista = new ArrayList<String>();
	
	public static void main (String[] args) {
		
		
	lista.add("ciao");
	lista.add("zorro");
	lista.add("adele");
	lista.add("ciccio");
	lista.add("pasticcio");
	lista.add("rrr");
	lista.add("rr");
	
	ordina();
	
	System.out.println(lista);
		
		
	}
	
	public static void ordina() {
		
		String appoggio;
		for (int i = 0; i < lista.size(); i++) {
			for (int j = i+1; j < lista.size(); j++) {
				if (lista.get(j).compareTo(lista.get(i)) < 0) {
					appoggio = lista.get(i);
					lista.set(i, lista.get(j));		
					lista.set(j, appoggio);			
			    }		
	     	}	
	    }
    }
}
