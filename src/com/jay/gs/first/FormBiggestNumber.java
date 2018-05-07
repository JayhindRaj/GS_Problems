package com.jay.gs.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FormBiggestNumber {

	public static void main(String[] args) {

		int[] n = new int[] { 1, 34, 3, 98, 9, 9, 5, 4, 76, 45, 4 };
		System.out.println(formBiggestNumber(n));
	}

	public static String formBiggestNumber(int[] n) {
		// Creating list of string and adding int element of given array in list. 
		List<String> list = new ArrayList<>();
		for (int i : n) {
			list.add(String.valueOf(i));
		}

		// Sorting the list using the StringComparator. 
		Collections.sort(list, new StringComparator());

		Iterator<String> it = list.iterator();
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			String str = it.next();
			sb.append(str);
		}

		return sb.toString();
	}
}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int a = Integer.parseInt(s1 + s2);
		int b = Integer.parseInt(s2 + s1);
		if (a > b) {
			return -1;
		} else if (a < b) {
			return 1;
		} else {
			return 0;
		}
	}

}
