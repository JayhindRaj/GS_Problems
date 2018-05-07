package com.jay.gs.first;

public class AddTwoFractions {

	public static void main(String[] args) {
		addTwoFractions(2, 3, 3, 4);
		addTwoFractions(3, 2, 4, 3);
		addTwoFractions(1, 3, 5, 4);
		addTwoFractions(5, 3, 0, 7);
		addTwoFractions(11, 3, 3, 11);
		addTwoFractions(101, 13, 59, 22);
		addTwoFractions(2, 5, 3, 5);
		addTwoFractions(4, 26, 16, 13);
		addTwoFractions(0, 26, 16, 13);
	}

	/**
	 * Get addition of two given fractions.
	 * 
	 * @param n1
	 *            - Numerator of first fraction.
	 * @param d1
	 *            - Denominator of first fraction.
	 * @param n2
	 *            - Numerator of second fraction.
	 * @param d2
	 *            - Denominator of second fraction.
	 */
	public static void addTwoFractions(int n1, int d1, int n2, int d2) {
		int lcm = getLCM(d1, d2);
		int n = n1 * (lcm / d1) + n2 * (lcm / d2);
		int gcd = getGCD(n, lcm);
		System.out.println((n / gcd) + "/" + (lcm / gcd));
	}

	/**
	 * Get LCM (Lowest Common Multiplicative) of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - LCM of n1 and n2
	 */
	private static int getLCM(int n1, int n2) {
		// if n1 and n2 are equal, then lcm is n1.
		if (n1 == n2) {
			return n2;
		}

		int large = n1 > n2 ? n1 : n2;
		int lcm = large;
		for (int i = large; i <= (n1 * n2); i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

	/**
	 * Get GCD (Greatest Common Divisor) of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - GCD of n1 and n2
	 */
	public static int getGCD(int n1, int n2) {
		int gcd = 1;
		int min = getMin(n1, n2);
		for (int i = min; i >= 1; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	/**
	 * Get minimum of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - minimum of n1 and n2.
	 */
	public static int getMin(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}
}
