package com.jay.gs.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestWordInDictionary {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"to","toe","toes","doe","dog","god","dogs","book","banana"};
		
		System.out.println(getLongestWord(Arrays.asList(arr), "dsetog"));
	}
	
	public static Set<String> getLongestWord(List<String> dictonary, String word) {
		int l = 0;
		Set<String> set = new HashSet<>();
		
		// Iterate through the dictionary.
		for(String s : dictonary) {
				// if current word in dic contains all chars of given word
			if(isContainsAllChar(s, word)) {
				if(s.length() > l) {
					 l = s.length();
					 set.clear();
					 set.add(s);
				} else if(s.length() == l) {
					set.add(s);
				}
			}
		}
		
		return set;
	}
	
	static boolean isContainsAllChar(String str, String word) {
		boolean isContains = true;
		char[] c = str.toCharArray();
		for(char c1 : c) {
			if(!word.contains(String.valueOf(c1))) {
				isContains = false;
				break;
			}
		}
		return isContains;
	}
}
