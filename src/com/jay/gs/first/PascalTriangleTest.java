package com.jay.gs.first;

public class PascalTriangleTest {

	public static void main(String[] args) {
		// System.out.println(getPascalNumber(3, 2));
		// System.out.println(getPascalNumber(2, 1));
		// System.out.println(getPascalNumber(2, 2));
		// System.out.println(getPascalNumber(4, 3));
		// System.out.println(getPascalNumber(6, 4));
		// System.out.println(getPascalNumber(4, 4));
		// System.out.println(getPascalNumber(3, 4));
		System.out.println(getPascalNumber(7, 1));
		System.out.println(getPascalNumber(7, 2));
		System.out.println(getPascalNumber(7, 3));
		System.out.println(getPascalNumber(7, 4));
		System.out.println(getPascalNumber(7, 5));
		System.out.println(getPascalNumber(7, 6));
		System.out.println(getPascalNumber(7, 7));
		System.out.println(getPascalNumber(7, 8));
		System.out.println(getPascalNumber(7, 0));
		// System.out.println(getPascalNumber(6, 5));
	}

	public static int getPascalNumber(int row, int col) {
		if (col > row) {
			System.out.println("Not a valid input.");
			return -1;
		}
		if (col == 0) {
			return 0;
		}

		if (row == col) {
			return 1;
		} else {
			return getPascalNumber(row - 1, col - 1)
					+ getPascalNumber(row - 1, col);
		}
	}
}
