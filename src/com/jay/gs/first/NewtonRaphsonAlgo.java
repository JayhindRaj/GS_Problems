package com.jay.gs.first;

public class NewtonRaphsonAlgo {

	public static void main(String[] args) {
		findSquareRoot(100);
		findSquareRoot(101);
		findSquareRoot(99);
		findSquareRoot(37);
		findSquareRoot(4043);
		findSquareRoot(4096);
		findSquareRoot(2029);

		findSquareRoot(17037);
		findSquareRoot(43);
		findSquareRoot(59);
		findSquareRoot(6);
		findSquareRoot(5);
		findSquareRoot(4);
		findSquareRoot(3);
		findSquareRoot(2);
		findSquareRoot(1);
	}

	public static float findSquareRoot(int n) {
		int s0 = 0;
		for (int i = 1; i <= n / 2 + 1; i++) {
			if (i * i > n) {
				s0 = i - 1;
				break;
			}
		}

		if (n == 1) {
			s0 = 1;
		}

		float s1 = function(s0, n);
		float s2 = function(s1, n);
		float s3 = function(s2, n);
		float s4 = function(s3, n);
		float s5 = function(s4, n);
		float s6 = function(s5, n);

		System.out.println("Square root of " + n + " is : " + s2);
		System.out.println("Square root of " + n + " is : " + s6);
		return s6;
	}

	private static float function(float f, int n) {
		float s = f - (f * f - n) / (2 * f);
		return s;
	}
}