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
	
	public static void test2(int n) {
		int[] arrayList = new int[n];
		arrayList[0] = arrayList[1] =1;
		for (int i = 0; i < arrayList.length; i++) {
			if (i == 0) {
				System.out.println("第" + (i+1) + "等于" + arrayList[0]);
			}else if (i == 1) {
				System.out.println("第" + (i+1) + "等于" + arrayList[1]);
			}else {
				arrayList[i] = arrayList[i-1] +arrayList[i-2];
				System.out.println("第" + (i+1) + "等于" + arrayList[i]);
			}
		}
	}
	
	public static int test3(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}else {
			return test3(n-1) + test3(n-2);
		}
	}

	public static void main(String[] args) {
//		test1(20);
//		test2(20);
		System.out.println(test3(50));
	}

}
