package logic;

public class IntToChar {

	/*
	 * Converte un intero nel relativo carattere ASCII
	 */
	
	public String intToChar(int input) {
		
		// Bug: interi negativi non gestiti
		return String.valueOf(Character.toChars(input));
	}
}
