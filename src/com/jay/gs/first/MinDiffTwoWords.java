package com.jay.gs.first;

import java.util.ArrayList;
import java.util.List;

public class MinDiffTwoWords {

	public static void main(String[] s) {
		String input = "ABC is XYZ and ABC & XYyZ";
		Integer distanceBetweenWord = mindistance("ABC", "XYyZ", input);
		System.out.println("Distance between words is " + distanceBetweenWord);

		/* Other Test cases */

		String str = "One office for loan of money for customs calc of goods , "
				+ "which by a plain method be so ordered that "
				+ "the merchant might with ease pay the highest "
				+ "customes down, and so, by allowing the bank "
				+ "four per cent advance, be first to secure "
				+ "the $10 per cent which the king allows for prompt";

		String s1 = "customs";
		String s2 = "the";

		if (mindistance("office", "loan", str) == 10
				&& mindistance("loan", "office", str) == 10
				&& mindistance("plain", "method", str) == 7
				&& mindistance("method", "plain", str) == 7
				&& mindistance("calc", "goods", str) == 8
				&& mindistance("for", "the", str) == 16
				&& mindistance("the", "for", str) == 16
				&& mindistance("so", "to", str) == 137
				&& mindistance("to", "so", str) == 137
//				&& mindistance("jayhind", "rajpoot", str) == 137
				&& mindistance("goods", "calc", str) == 8) {
			System.out.println("Tests passed");
		} else {
			System.out.println("Tests failed");
		}
	}

	static Integer mindistance(String s1, String s2, String input) {
		int minDistance = 0;
		List<Integer> indecis1 = getIndecis(input, s1);
		List<Integer> indecis2 = getIndecis(input, s2);

		if (indecis1 == null || indecis1.size() == 0) {
			System.out
					.println("Given string does not contains the word: " + s1);
		}

		if (indecis2 == null || indecis2.size() == 0) {
			System.out
					.println("Given string does not contains the word: " + s2);
		}

		int[] indecisArr1 = toArray(indecis1);
		int[] indecisArr2 = toArray(indecis2);

		minDistance = minDiff(indecisArr1, indecisArr2);

		return minDistance;
	}

	public static int[] toArray(List<Integer> list) {
		int[] arr = null;

		if (list != null && list.size() > 0) {
			arr = new int[list.size()];

			for (int j = 0; j < list.size(); j++) {
				arr[j] = list.get(j);
			}
		}

		return arr;
	}

	public static List<Integer> getIndecis(String str, String word) {

		List<Integer> indecis = new ArrayList<>();
		int index = 0;

		int l = word.length() / 2;
		for (int i = 0; i < (str.length() - word.length());) {

			index = str.indexOf(word, i);

			// Return if index is -1
			if (index == -1) {
				return indecis;
			}

			// if index is 0
			if (index == 0) {
				indecis.add(index + l);
			}

			// if word is in between of string with exact match
			if (index > 0 && index < (str.length() - word.length())) {
				if (str.charAt(index - 1) == ' '
						&& str.charAt(index + word.length()) == ' ') {
					indecis.add(index + l);
				}
			}

			// if word is in the end of string with exact match
			if (index == (str.length() - word.length())) {
				if (str.charAt(index - 1) == ' ') {
					indecis.add(index + l);
				}
			}

			i = index + word.length();
		}

		return indecis;
	}

	public static int minDiff(int[] a, int[] b) {
		if (a != null && a.length > 0 && b != null && b.length > 0) {
			int m = a.length, n = b.length, i = 0, j = 0;
			int res = Math.abs(a[i] - b[j]);

			while (i < m && j < n) {
				if (Math.abs(a[i] - b[j]) <= res) {
					res = Math.abs(a[i] - b[j]);
				}

				if (a[i] < b[j]) {
					i++;
				} else {
					j++;
				}
			}
			return res;
		} else {
			return 0;
		}
	}
}
