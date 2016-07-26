package com.test.wangmy;

public class Sort {
	
	public void maoPao() {
		int[] a = {1,2,3,6,9,80,123,22,344,6};
		System.out.println("排序之前：");
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length- i - 1; j++) {
				if (a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("\n排序之后：");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.maoPao();
	}

}
