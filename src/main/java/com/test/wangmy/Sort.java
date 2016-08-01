package com.test.wangmy;

public class Sort {
	
	public void selectSort() {
		int[] a = {1,2,3,6,9,80,123,22,344,6};
		int size = a.length, temp;
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public void bubbleSort() {
		int[] a = {1,2,3,6,9,80,123,22,344,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length- i - 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.bubbleSort();
//		System.out.println();
//		sort.selectSort();
	}

}
