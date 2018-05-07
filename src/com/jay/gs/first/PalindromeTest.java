package com.jay.gs.first;

public class PalindromeTest {

	public static void main(String[] args) {
		String str = "SSSSSSSABBBBBBBBBBAS";
		System.out.println("Longest palindrome of given string " + str
				+ " is : " + getLargestPalindrome(str));
		String str2 = "DAAASSSSSSSABBBDBBBGGGGGGGGBBBdBASAAAAd";
		System.out.println("Longest palindrome of given string " + str2
				+ " is : " + getLargestPalindrome(str2));
		String str3 = "Jaaaabaaaaj";
		System.out.println("Longest palindrome of given string " + str3
				+ " is : " + getLargestPalindrome(str3));
	}

	public static String getLargestPalindrome(String str) {
		String largestPa = "";

		// convert to upper case.
		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			int startIndex = i;
			int endIndex = i;
			/*
			 * Check if next char is same as at current index. increase the
			 * endIndex by 1;
			 */
			if (i < (str.length() - 1) && (str.charAt(i) == str.charAt(i + 1))) {
				endIndex++;
			}
			
			String str1 = "";
			for (; startIndex >= 0 && endIndex < str.length(); startIndex--, endIndex++) {
				char lc = str.charAt(startIndex);
				char rc = str.charAt(endIndex);
				if (lc == rc) {
					if (startIndex == endIndex) {
						str1 = String.valueOf(lc) + str1;
					} else {
						str1 = String.valueOf(lc) + str1 + String.valueOf(rc);
					}
				} else {
					if (str1.length() > largestPa.length()) {
						largestPa = str1;
					}
					str1 = "";
					break;
				}
			}

			// if new palindrome is bigger than previous one
			// then replace previous one to latest one.
			if (str1.length() > largestPa.length()) {
				largestPa = str1;
			}

			// if the length of palindrome is equal to length of given string,
			// stop the loop
			if (largestPa.length() == str.length()) {
				break;
			}
		}

		return largestPa;
	}
}