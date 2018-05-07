package com.jay.gs.first;

public class StairCaseProblem {

	static int countWaysUtils(int n, int m) {

		if (n <= 1) {
			return n;
		}

		int res = 0;
        //&& i <= n
		for (int i = 1; i <= m && i <= n; i++) {
			res = res + countWaysUtils(n - i, m);
		}

		return res;
	}

	static int countWays(int s, int m) {
		return countWaysUtils(s + 1, m);
	}

	public static void main(String[] args) {
			int s = 3, m = 2;
			
			System.out.println("Number of ways: " + countWays(s, m));
			System.out.println("Number of ways: " + countWays(5, 2));
			System.out.println("Number of ways: " + countWays(3, 3));
//			System.out.println("Number of ways: " + countWays(6, 1));
//			System.out.println("Number of ways: " + countWays(6, 2));
//			System.out.println("Number of ways: " + countWays(6, 3));
	}
}
