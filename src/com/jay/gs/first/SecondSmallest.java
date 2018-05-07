package com.jay.gs.first;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] n = new int[] { 11, 7, 9, 4, 12, 8, 30, 13 };
		
		int[] n1 = new int[] { 3, 5, 6, 9, 10, 11, 1 };
		int[] n2 = new int[] { 3, 1, 1, 2, 2, 5, 3 };
		System.out.println("Second Smallest Number : " + secondSmallest(n2));

		System.out.println("Second Smallest Number in Sorted Rotated Array: "
				+ secondSmallestIRA(n1));
	}

	/**
	 * Find second smallest number in given unsorted int array.
	 * 
	 * @param n - int array
	 * @return int - second smallest number
	 */
	public static int secondSmallest(int[] n) {
		int fs = n[0], ss = n[0];

		for (int i = 1; i < n.length; i++) {
			// if current element is smaller than first smallest.
			if (n[i] < fs ) {
				ss = fs;
				fs = n[i];
			} else if (n[i] < ss && n[i] > fs) { // if current element is smaller than second smallest but greater then or equal first smallest.
				ss = n[i];
			}
		}
		return ss;
	}

	/**
	 * Find second smallest number in given sorted rotated int array.
	 * 
	 * @param n - int array
	 * @return int - second smallest number
	 */
	public static int secondSmallestIRA(int[] n) {
		int ss = n[1];
		int prev = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] < prev) {// if current element is smaller than previous element.
				if (i == n.length - 1) { // if current element is the last element of array.
					ss = n[0]; // second smallest will be 1st element
				} else {
					ss = n[i + 1]; // second smallest will be next element.
				}
				break;
			} else if (n[i] > prev) { // if current element is greater than previous element then continue. 
				prev = n[i];
			}
		}

		return ss;
	}
}
