package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.IntToChar;

public class TestIntToChar {
	
	/*
	 * Unit testing con interi positivi e minori di 26 (Uncovered edge cases)
	 */

	@Test
	public void testIntToChar1() {
		
		int input = 0;
		
		IntToChar test = new IntToChar();
		
		assertEquals("A", test.intToChar(input));
	}
	
	@Test
	public void testIntToChar2() {
		
		int input = 3;
		
		IntToChar test = new IntToChar();
		
		assertEquals("D", test.intToChar(input));
	}
}
