package com.jay.gs.first;

public class LargestUniqueSubstring {

	public static void main(String[] args) {
		System.out.println(getLargestUniqueSubString("aaabcbdeaf"));
		System.out.println(getLargestUniqueSubString("jayhind"));
		System.out.println(getLargestUniqueSubString("jayhind"));
		System.out.println(getLargestUniqueSubString("jayhindmflsjayhind "));
		System.out.println(getLargestUniqueSubString("jayhind"));
		System.out.println(getLargestUniqueSubString("ajay"));
		System.out.println(getLargestUniqueSubString("Chanchal"));
		System.out.println(getLargestUniqueSubString("Rohilla"));
		System.out.println(getLargestUniqueSubString("Mohit"));
		System.out.println(getLargestUniqueSubString("kesarwani"));
		System.out.println(getLargestUniqueSubString("Kamlakant patel"));
		System.out.println(getLargestUniqueSubString("shambhu madhesiya"));
	}
	
	public static String getLargestUniqueSubString(String str) {
		String st = String.valueOf(str.charAt(0));
		String st1 = String.valueOf(str.charAt(0));
		
		// Iterating through the string length.
		for(int i = 1; i < str.length() ; i ++) {
			// char at ith index.
			char c = str.charAt(i);
			// if temp string st1 contains char c
			if(st1.contains(String.valueOf(c))) {
				if(st1.length()> st.length()) {
					st = st1;
				}
				st1 = st1.substring(st1.indexOf(String.valueOf(c)) + 1) + String.valueOf(c);
			} else { // if temp string st1 does not contain char c, concatenate the current char in temp string.
				st1 = st1 + String.valueOf(c);
			}
		}
		
		if(st1.length()> st.length()) {
			st = st1;
		}
		return st;
	}
}