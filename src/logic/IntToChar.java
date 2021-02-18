package logic;

import java.util.ArrayList;
import java.util.List;

public class IntToChar {

	/*
	 * Prende un intero in input e restituisce il relatico carattere dell'alfabeto
	 */
	
	public String intToChar(int input) {
		
		// Bug: interi negativi e maggiori di 25 non gestiti	
		List<String> chars = new ArrayList<>();
		for (int i=0; i<26; i++) {
			int c = 65+i;
			chars.add(String.valueOf((char)c));
		}

		return chars.get(input);
	}
}
