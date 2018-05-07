package com.jay.gs.first;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberPair {

	public static void main(String[] args) {
		int[] n1 = new int[]{2, 4, 6, 3, 7, 6};
		System.out.println(getPairs(n1));
		int[] n2 = new int[]{2, 4};
		System.out.println(getPairs(n2));
		int[] n3 = new int[]{2};
		System.out.println(getPairs(n3));
		
		int[] n4 = new int[]{2, 1,4, 6,5,3,7};
		
		System.out.println(getPairsWhoseSumIsEqual(n4, 7));
	}

	// if a^b == b^a
	public static Map<Integer, Integer> getPairs(int[] n) {
		Map<Integer, Integer > map = null;
		if(n != null && n.length > 1) {
			map = new LinkedHashMap<>();
			for(int i = 0; i < n.length - 1; i++) {
				for(int j = i + 1; j < n.length; j++) {
					if(isTransitive(n[i], n[j])) {
						map.put(n[i], n[j]);
					}
				}
			}
		}
		return map;
	}

	// if a + b = n
	public static Map<Integer, Integer> getPairsWhoseSumIsEqual(int[] n, int number) {
		Map<Integer, Integer > map = null;
		if(n != null && n.length > 1) {
			map = new LinkedHashMap<>();
			for(int i = 0; i < n.length - 1; i++) {
				for(int j = i + 1; j < n.length; j++) {
					if(n[i] + n[j] == number) {
						map.put(n[i], n[j]);
					}
				}
			}
		}
		return map;
	}
	
	public static boolean isTransitive(int a, int b) {
		return Math.pow(a, b)== Math.pow(b, a) ? true : false; 
	}
}
