package com.test.cycle;

public class QuickSort {
	private static void quick(int[] a){
		if (a.length > 0) {
			quickSort(a, 0, a.length-1);
		}
	}
	
	private static void quickSort(int[] a, int low, int heigh) {
		if (low < heigh) {
			int middle = getMiddle(a, low, heigh);
		}
	}
	
	private static int getMiddle(int[] a, int low, int heigh) {
		int temp = a[low];
		while (low < heigh) {
			
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] aList = {3,5,1,2,4};
		System.out.println("排序之前－－－－－－－－－－－－－－");
		for (int i : aList) {
			System.out.print(i + " ");
		}
		quick(aList);
		System.out.println("排序之后－－－－－－－－－－－－－－");
		for (int i : aList) {
			System.out.print(i + " ");
		}
	}

}
