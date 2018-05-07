package com.jay.gs.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramTest {

	public static void main(String[] args) {
		System.out.println(isAnagram("pool", "loop"));
		System.out.println(isAnagram("sajw", "wafs"));
		System.out.println(isAnagram("credit", "direct"));
		System.out.println(isAnagram("meat", "team"));
		System.out.println(isAnagram("peek", "keep"));
		System.out.println(isAnagram("pool", "loep"));
		
		List<String> list = new ArrayList<String>();
		list.add("was");
		list.add("credit");
		list.add("loop");
		list.add("tea");
		list.add("team");
		list.add("direct");
		list.add("saw");
		list.add("eat");
		list.add("meat");
		list.add("swa");
		list.add("pool");
		list.add("polo");
		
		printMap(groupOfAnagrams(list));
	}

	public static void printMap(Map<String, List<String>> map) {
		if(map!=null) {
			Iterator<String> keys = map.keySet().iterator();
			while (keys.hasNext()) {
				String key = keys.next();
				List<String> anagrams = map.get(key);
				
				if(anagrams!= null && !anagrams.isEmpty()) {
					System.out.println(key+ " :: " + anagrams);
				}
			}
		}
	}
	
	
	public static Map<String, List<String>> groupOfAnagrams(List<String> list) {
		Map<String, List<String>> map = new HashMap<>();

		for(int index = 0; index < list.size() - 1; index++) {
			String s1 = list.get(index);
			for(int index2 = index + 1 ; index2 < list.size(); index2++) {
				String s2 = list.get(index2);
				if(isAnagram(s1, s2)) {
					if(map.get(s1)== null) {
						List<String> l = new ArrayList<>();
						l.add(s2);
						map.put(s1,l);
					} else {
						map.get(s1).add(s2);
					}
				}
				
			}
		}
		
		return map;
	}

	private static boolean isAnagram(String s1, String s2) {
		boolean isAnagram = false;

		// If string's length is not same. return false.
		if (s1.length() != s2.length()) {
			return isAnagram;
		}

		// Char frequency map of String1
		Map<String, Integer> map1 = getCharFrequencyInString(s1);
		
		// Char frequency map of String2
		Map<String, Integer> map2 = getCharFrequencyInString(s2);

		// If size of frequencies map is not same.
		if (map1.size() != map2.size()) {
			return isAnagram;
		}

		Iterator<String> keys1 = map1.keySet().iterator();

		while (keys1.hasNext()) {
			String key = keys1.next();
			
			// if map2 contains the key.
			if (map2.containsKey(key)) {
				if (map1.get(key) == map2.get(key)) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}
			} else {
				isAnagram = false;
				break;
			}
		}

		return isAnagram;
	}

	private static Map<String, Integer> getCharFrequencyInString(String string) {
		Map<String, Integer> map = new HashMap<>();

		char[] ch = string.toCharArray();

		for (char c : ch) {
			String s = String.valueOf(c);
			map.put(s, (map.get(s) == null ? 1 : map.get(s) + 1));
		}

		return map;
	}
}
