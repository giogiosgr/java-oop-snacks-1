package org.snacks.java;

import java.util.*;

public class Snack5 {
	
	static HashMap<String, String> elementi = new HashMap<String, String>();

	public static void main(String[] args) {
		
		
		elementi.put("andrea", "presente");
		elementi.put("giacomo", "assente");
		elementi.put("giulia", "assente");
		elementi.put("francesco", "presente");
		
		

		if (checkChiaveDuplicata("francesco")) {
			System.out.println("elemento già presente");
		}

	}
	
	public static boolean checkChiaveDuplicata (String key) {
		
		int size = elementi.keySet().size();
		
		// deepcopy dell'HashMap originale
		HashMap<String, String> newElementi = new HashMap<String, String>(elementi);
		
		newElementi.put(key, "");
		
		if (newElementi.keySet().size() == size) {
			return true;
		}   else {
			  return false;
		}	
    }
}
