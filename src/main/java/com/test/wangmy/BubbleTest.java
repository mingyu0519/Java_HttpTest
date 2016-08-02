package com.test.wangmy;

public class BubbleTest {

	public static void main(String[] args) {
		int temp=0;
		int[] a = {3,6,2,4,5,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] < a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
