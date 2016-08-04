package com.test.cycle;

public class BubbleSort {

	public static void main(String[] args) {
		int[] aList = {4,5,2,1,3};
		int temp = 0;
		for (int i = 0; i < aList.length - 1; i++) {
			for (int j = 0; j < aList.length - i - 1; j++) {
				if (aList[j] > aList[j+1]) {
					temp = aList[j];
					aList[j] = aList[j+1];
					aList[j+1] = temp;
				}
			}
		}
		for (int i : aList) {
			System.out.print(i + "  ");
		}
	}

}
