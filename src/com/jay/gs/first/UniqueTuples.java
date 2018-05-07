package com.jay.gs.first;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {

	public static void main(String[] args) {
		
		System.out.println(findUniqueTuples("aab", 2));
		System.out.println(findUniqueTuples("abcd", 3));
		System.out.println(findUniqueTuples("abcdabdcdasfes", 2));
		System.out.println(findUniqueTuples("abcdabdcdasfes", 3));
		System.out.println(findUniqueTuples("abcdabdcdasfes", 4));
		System.out.println(findUniqueTuples("abcdabdcdasfes", 5));
	}
	
	public static Set<String> findUniqueTuples(String str, int length) {
		Set<String> set = new LinkedHashSet<>();

		for(int i = 0; i < (str.length() - length + 1); i++) {
			set.add(str.substring(i, i+length));
		}
		return set;
	}
}
