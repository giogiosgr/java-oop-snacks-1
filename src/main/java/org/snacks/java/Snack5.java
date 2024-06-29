package org.snacks.java;

import java.util.*;

public class Snack5 {
	
	static HashMap<String, String> elementi = new HashMap<String, String>();

	public static void main(String[] args) {
		
		elementi.put("andrea", "presente");
		elementi.put("giacomo", "assente");
		elementi.put("giulia", "assente");
		elementi.put("francesco", "presente");
		
		if (checkChiaveDuplicata(elementi, "francesco")) {
			System.out.println("elemento già presente");
		} else System.out.println("elemento non presente");

	}
	
	public static boolean checkChiaveDuplicata (HashMap<String, String> newMap, String key) {
		
		// nuovo HashSet
		HashSet <String> temp = new HashSet<String>(newMap.keySet());
		
		int size = newMap.keySet().size();
		
		temp.add(key);
		
		if (temp.size() == size) {
			return true;
		}   else {
			  return false;
		}	
    }
}
