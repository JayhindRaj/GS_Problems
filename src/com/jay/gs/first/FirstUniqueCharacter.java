package com.jay.gs.first;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		getFirstUniqueChar("abeaabdccf");
		getFirstUniqueChar("abeaabfdeggdfgodccf");
		getFirstUniqueChar("");
		getFirstUniqueChar(null);
		getFirstUniqueChar("j");
	}

	public static void getFirstUniqueChar(String s) {
		if (s != null && !s.isEmpty()) {
			for (int index = 0; index < s.length(); index++) {
				String s1 = s.replaceAll(String.valueOf(s.charAt(index)), "");
				if (s1.length() == s.length() - 1) {
					System.out.println("First unique char in " + s + " is : "
							+ s.charAt(index));
					
					break;
				}
			}
		} else {
			System.out.println("Given input is either null or empty.");
		}
	}
}
