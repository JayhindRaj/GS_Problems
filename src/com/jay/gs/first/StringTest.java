package com.jay.gs.first;

public class StringTest {

	public static void main(String[] args) {
		firstLongestRepeatingString("aabbbbggggggggkkkkkkkkkkkkkkkkkgggggddcc");
		firstLongestRepeatingString("aabbbbgggggghhhggkkkkkkkkjjjjjjjkkkkkkkkkgggggddcc");
		firstLongestRepeatingString("aabbbbgggggglllllllllllkllllooooooooggkkkkkkkjlasjdasljdkkkkkkkkkkgggggddcc");
	}

	public static void firstLongestRepeatingString(String str) {

		if (!isEmptyOrNull(str)) {
			char c = str.charAt(0);

			int startIndex = 0, j = 0;
			int count = 1;
			String s = "";
			for (int i = 1; i < str.length(); i++) {
				char c1 = str.charAt(i);
				if (c1 == c) {
					count++;
				} else {
					if (count > s.length()) {
						s = str.substring(startIndex, i);
						j = startIndex;
					}
					c = c1;
					count = 1;
					startIndex = i;
				}
			}

			System.out.println("[" + j + ", " + s.length() + ", " + s + "]");
		}
	}

	public static boolean isEmptyOrNull(String str) {

		if (str == null) {
			return true;
		}

		if ("".equals(str)) {
			return true;
		}

		return false;
	}
}
