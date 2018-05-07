package com.jay.gs.first;

import java.util.ArrayList;
import java.util.List;

public class MinDistanceTwoWords {

	public static void main(String[] args) {
//		 minDistance2("ABC ABC HFJS XYZ", "ABC", "XYZ");
//		 minDistance2("this is an umbrella thiss l fds this", "this", "is");
//		 minDistance2("ABCXYT ABC HFJJJJJS XYZ", "XYZ", "HFJJJJJS");
//		 minDistance2("ABCXYZ ABC HFJJJJJS XYZ",  "HFJJJJJS", "XYZ");
//		 minDistance2("XYZ jdfh ABC ssk f ksfhk  ABC HFJJJJJS AXYZ",  "HFJJJJJS", "XYZ");
//		 minDistance2("XYZ AXYZ XYZA jdfh ABCD ssk f ksfhk  ABC HFJJJJJS XYZ fgdgd ABC  XYZ",  "ABC", "XYZ");
//		 minDistance2("XYZ AXYZ XYZA jdfh ABCD ssk f ksfhk  ABC HFJJJJJS XYZ fgdgd ABC  XYZ",  "XYZ", "ABC");
		 
		 String str = "One office for loan of money for customs calc of goods , "
			        + "which by a plain method be so ordered that " + "the merchant might with ease pay the highest "
			        + "customes down, and so, by allowing the bank " + "four per cent advance, be first to secure "
			        + "the $10 per cent which the king allows for prompt";

			    String s1 = "customs";
			    String s2 = "the";
			    
int t1 = minDistance2("office", "loan", str);
int t2 = minDistance2("plain", "method", str);
int t3 = minDistance2("calc", "goods", str);

System.out.println("t1: " + t1 + ", t2: " + t2 + ", t3: " + t3);
			    if (t1 == 10 
			        && t2 == 7 && t3 == 8) {
			      System.out.println("Tests passed");
			    } else {
			      System.out.println("Tests failed");
			    }
		 
		 
		 
	}

	public static int minDistance2(String word1, String word2, String str) {
		System.out.println("*********************************************");
		int l = str.length();
//		System.out.println("Input String: " + str);
//		System.out.println("Length: "+ l);
		List<Integer> index1 = getIndecis(str, word1);
		List<Integer> index2 = getIndecis(str, word2);

		System.out.println("indexes of word1 " + word1 + " : " + getIndecis(str, word1));
		System.out.println("indexes of word2 " + word2 + " : " + getIndecis(str, word2));
		
		if(index1.size() == 0 || index2.size() == 0 || index1.get(0)== -1 || index2.get(0)== -1) {
			return 0;
		}
		
		if (index1.get(index1.size() - 1) == -1) {
			index1.remove(new Integer(-1));
		}

		if (index2.get(index2.size() - 1) == -1) {
			index2.remove(new Integer(-1));
		}
		
		int[] a = new int[index1.size()];
		int[] b = new int[index2.size()];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = index1.get(i);
		}
		
		for(int i = 0; i < b.length; i++) {
			b[i] = index2.get(i);
		}
		
		int l1 = word1.length()/2;
		int l2 = word2.length()/2;
		
		int ld = l1 < l2 ? l2 -l1: l1 - l2;
		
		int minD = findSmallestDifference(a, b) - ld;
		System.out.println("Minimum distance between " + word1 + " & " + word2 + " is: " + minD);
		return minD;
	}

	public static List<Integer> getIndecis(String str, String word) {
		List<Integer> indecis = new ArrayList<Integer>();
		int l = str.length();
		
		for (int i = 0; i < (l - word.length());) {
			int index = str.indexOf(word, i);
			
			if (index == -1) {
				break;
			}
			
			// If String starts with given word
			if(index == 0) {
				indecis.add(index);
			} else if(index == (l - word.length()) && str.charAt(index - 1) == ' ') {//If String ends with given word and previous char is SPACE
				indecis.add(index);
			} else if(index != 0 && str.charAt(index - 1) == ' ' && str.charAt(index + word.length()) == ' ') { // if word is in between of string and having EXACT MATCH
				indecis.add(index);	
			}
			
			i = index + word.length();
		}
		
		return indecis;
	}
	
	static int findSmallestDifference(int A[], int B[]) {
		int m = A.length;
		int n = B.length;
		int a = 0, b = 0;

		// Initialize result as max value
		int result = Integer.MAX_VALUE;

		// Scan Both Arrays upto sizeof of the
		// Arrays
		while (a < m && b < n) {
			if (Math.abs(A[a] - B[b]) < result)
				result = Math.abs(A[a] - B[b]);

			// Move Smaller Value
			if (A[a] < B[b]) {
				a++;
			} else {
				b++;
			}
		}

		// return final sma result
		return result;
	}
}