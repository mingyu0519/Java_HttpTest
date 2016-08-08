package com.test.algorithm;

public class Fibonacci {
	public static void test1(int n) {
		int a = 1, b=1, c = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.println("第" + i + "等于" + a);
			}else if (i == 2) {
				System.out.println("第" + i + "等于" + b);
			}else {
				c = a+b;
				a = b;
				b = c;
				System.out.println("第" + i + "等于" + c);
			}
		}
	}

	public static void main(String[] args) {
		test1(20);
	}

}
