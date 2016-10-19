package me.lorenz;

import java.util.HashMap;

public class Baudot {

	//Creates a new hash map used for containing ITA2(Baudot) characters
	private HashMap<String, String> ita2 = new HashMap<>();
	
	//Creates a new hash map used for containing ASCII characters
	private HashMap<String, String> ascii = new HashMap<>();
	
	//Creates a new hash map used for containing numbers
	private HashMap<String, String> numbers = new HashMap<>();
	
	//Creates a new hash map used for containing special characters (dots and brackets)
	private HashMap<String, String> specialChars = new HashMap<>();
	
	/**
	 * Adds ITA2 values with ASCII symbols into ita2 HashMap while also adds ASCII symbols
	 * with ITA2 values into ascii HashMap
	 */
	public void populateMaps() {
		ita2.put("00011", "A");
		ita2.put("11001", "B");
		ita2.put("01110", "C");
		ita2.put("01001", "D");
		ita2.put("00001", "E");
		ita2.put("01101", "F");
		ita2.put("11010", "G");
		ita2.put("10100", "H");
		ita2.put("00110", "I");
		ita2.put("01011", "J");
		ita2.put("01111", "K");
		ita2.put("10010", "L");
		ita2.put("11100", "M");
		ita2.put("01100", "N");
		ita2.put("11000", "O");
		ita2.put("10110", "P");
		ita2.put("10111", "Q");
		ita2.put("01010", "R");
		ita2.put("00101", "S");
		ita2.put("10000", "T");
		ita2.put("00111", "U");
		ita2.put("11110", "V");
		ita2.put("10011", "W");
		ita2.put("11101", "X");	
		ita2.put("10101", "Y");
		ita2.put("10001", "Z");
		ita2.put("00100", " ");
		ita2.put("00000", "null");
		ita2.put("01000", "\r");
		ita2.put("00010", "\r");
		ita2.put("11011", "");
		ita2.put("11111", "");
		
		ascii.put("A", "00011");
		ascii.put("B", "11001");
		ascii.put("C", "01110");
		ascii.put("D", "01001");
		ascii.put("E", "00001");
		ascii.put("F", "01101");
		ascii.put("G", "11010");
		ascii.put("H", "10100");
		ascii.put("I", "00110");
		ascii.put("J", "01011");
		ascii.put("K", "01111");
		ascii.put("L", "10010");
		ascii.put("M", "11100");
		ascii.put("N", "01100");
		ascii.put("O", "11000");
		ascii.put("P", "10110");
		ascii.put("Q", "10111");
		ascii.put("R", "01010");
		ascii.put("S", "00101");
		ascii.put("T", "10000");
		ascii.put("U", "00111");
		ascii.put("V", "11110");
		ascii.put("W", "10011");
		ascii.put("X", "11101");
		ascii.put("Y", "10101");
		ascii.put("Z", "10001");
		ascii.put(" ", "00100");
		ascii.put("null", "00000");
		ascii.put("CR", "01000");
		ascii.put("LF", "00010");
		ascii.put("FIGS", "11011");
		ascii.put("", "11111");
		
		ascii.put("a", "00011");
		ascii.put("b", "11001");
		ascii.put("c", "01110");
		ascii.put("d", "01001");
		ascii.put("e", "00001");
		ascii.put("f", "01101");
		ascii.put("g", "11010");
		ascii.put("h", "10100");
		ascii.put("i", "00110");
		ascii.put("j", "01011");
		ascii.put("k", "01111");
		ascii.put("l", "10010");
		ascii.put("m", "11100");
		ascii.put("n", "01100");
		ascii.put("o", "11000");
		ascii.put("p", "10110");
		ascii.put("q", "10111");
		ascii.put("r", "01010");
		ascii.put("s", "00101");
		ascii.put("t", "10000");
		ascii.put("u", "00111");
		ascii.put("v", "11110");
		ascii.put("w", "10011");
		ascii.put("x", "11101");
		ascii.put("y", "10101");
		ascii.put("z", "10001");
		
		numbers.put("1", "1");
		numbers.put("2", "2");
		numbers.put("3", "3");
		numbers.put("4", "4");
		numbers.put("5", "5");
		numbers.put("6", "6");
		numbers.put("7", "7");
		numbers.put("8", "8");
		numbers.put("9", "9");
		numbers.put("0", "0");
		
		specialChars.put(".", ".");
		specialChars.put("(", "(");
		specialChars.put(")", ")");
		specialChars.put("_", "_");
		specialChars.put("&", "&");
		specialChars.put("!", "!");
		specialChars.put("\"", "\"");
		specialChars.put(":", ":");
		specialChars.put(";", ";");
	}
	
	/**
	 * Gets the ASCII symbol coresponding the ITA2 code
	 * @param string - Baudot code
	 * @return ASCII symbol
	 */
	public String getLetter(String string) {
		return ita2.get(string);
	}
	
	/**
	 * Gets the Baudot code coresponding to ASCII symbol
	 * @param asciiValue - ASCII symbol
	 * @return Baudot code
	 */
	public String getBaudot(String asciiValue) {
		return ascii.get(asciiValue);
	}
	
	/**
	 * Gets the number coresponding to the value entered
	 * @param number - value must be equal or less than 9
	 * @return Number value
	 */
	public String getNumber(String number) {
		int num = Integer.parseInt(number);
		if (num <= 9) {
			return numbers.get(number);
		}
		return null;
	}
	
	/**
	 * Gets the special character coresponding to the one entered
	 * @param specialChar - special character to be get
	 * @return Special character
	 */
	public String getSpecialCharacter(String specialChar) {
		return specialChars.get(specialChar);
	}
	
}
