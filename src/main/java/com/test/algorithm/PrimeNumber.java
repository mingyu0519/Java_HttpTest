package com.test.algorithm;

public class PrimeNumber {

	public static void main(String[] args) {
		int sum = 0;
		int j = 0;
		for (int i = 101; i <= 200; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + "  ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("101-200之间有 " + sum + " 个素数！");
	}

}
