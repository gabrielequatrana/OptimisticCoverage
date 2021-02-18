package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.IntToChar;

public class TestIntToChar {
	
	/*
	 * Unit testing per interi positivi
	 */

	@Test
	public void testIntToChar1() {
		
		int input = 65;
		
		IntToChar test = new IntToChar();
		
		assertEquals("A", test.intToChar(input));
	}
	
	@Test
	public void testIntToChar2() {
		
		int input = 68;
		
		IntToChar test = new IntToChar();
		
		assertEquals("D", test.intToChar(input));
	}
}
