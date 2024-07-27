package org.snacks.java;

import java.util.*;

public class ListaInvitati {

	public static void main(String[] args) {
		
		List<String> guests = new ArrayList<>();
		
		guests.add("pippo");
		guests.add("pluto");
		guests.add("paperino");
		guests.add("tizio");
		guests.add("pinco");
		guests.add("pallo");
		
		System.out.println(searchGuestIndex(guests, "tizio")); // mi aspetto che l'indice stampato sia 3
		
		System.out.println(searchGuestIndex(guests, "sempronio")); // mi aspetto che venga stampato -1

	}
	
	public static int searchGuestIndex(List<String> list, String guest) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).toLowerCase().equals(guest.toLowerCase())) return i;
		}
		
		return -1;
	}

}
