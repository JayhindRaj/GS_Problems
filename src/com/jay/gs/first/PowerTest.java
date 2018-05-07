package com.jay.gs.first;

public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isAPowerOfB(9, 3));
		 System.out.println(isAPowerOfB(19683, 3));
		 System.out.println(isAPowerOfB(343, 7));
		 System.out.println(isAPowerOfB(36, 6));
		 System.out.println(isAPowerOfB(64, 2));
		 System.out.println(isAPowerOfB(63, 2));
		 System.out.println(isAPowerOfB(65, 2));
		 System.out.println(isAPowerOfB(121, 11));
		 System.out.println(isAPowerOfB(120, 12));
		 System.out.println(isAPowerOfB(120, 11));
		 System.out.println(isAPowerOfB(122, 11));
		 System.out.println(isAPowerOfB(1000000, 10));

		System.out.println(isAPowerOfTen(0.001000));
		System.out.println(isAPowerOfTen(100000));
		System.out.println(isAPowerOfTen(1));
		System.out.println(isAPowerOfTen(.1));

		System.out.println(isAPowerOfTen(.103));
		System.out.println(isAPowerOfTen(.2));
		System.out.println(isAPowerOfTen(.0123));

		System.out.println(isAPowerOfTen(.0110));
		System.out.println(isAPowerOfTen(10010));
		System.out.println(isAPowerOfTen(10253));

	}

	public static boolean isAPowerOfB(int a, int b) {
		boolean isPowerofB = false;
		while (a >= 1) {
			if (a % b == 0) {
				a = a / b;
			} else {
				break;
			}

			if (a == 1) {
				isPowerofB = true;
				break;
			}
		}
		return isPowerofB;
	}

	public static boolean isAPowerOfTen(double a) {
		boolean isPowerofTen = false;
		
		// If number is equal to 1
		if (a == 1) {
			return true;
		}
		
		// If number is greater than 1
		if (a > 1) {
			while (a >= 1) {
				if (a % 10 == 0) {
					a = a / 10;
				} else {
					break;
				}

				if (a == 1) {
					isPowerofTen = true;
					break;
				}
			}
		} else {// If number is less than 1
			while (a < 1.0) {
				a = a * 10;
				if (a == 1) {
					isPowerofTen = true;
				}
			}
		}
		return isPowerofTen;
	}
}