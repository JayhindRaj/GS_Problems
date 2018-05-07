package com.jay.gs.first;

public class ArmstrongTest {

	public static void main(String[] args) {
		System.out.println(isArmstrong(0));
		System.out.println(isArmstrong(1));
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(370));
		System.out.println(isArmstrong(371));
		System.out.println(isArmstrong(407));
		System.out.println(isArmstrong(154));
		System.out.println(isArmstrong(234));
		System.out.println(isArmstrong(378));
		System.out.println(isArmstrong(29));
	}

	public static boolean isArmstrong(int n) {
		int r = 0, sum = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		return temp == sum ? true : false;
	}
}