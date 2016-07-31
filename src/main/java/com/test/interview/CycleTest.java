package com.test.interview;

public class CycleTest {
	public void testCycle() {
		int[] arrayList = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < arrayList.length; i++) {
			System.out.print(arrayList[i] + " ");
		}
		System.out.println();
		
		int j = 0;
		do {
			System.out.print(arrayList[j] + " ");
			j++;
		} while (j < arrayList.length);
		System.out.println();
		
		int m = 0;
		while (m < arrayList.length) {
			System.out.print(arrayList[m] + " ");
			m++;
		}
	}
	public static void main(String[] args) {
		CycleTest cycleTest = new CycleTest();
		cycleTest.testCycle();
	}
}
