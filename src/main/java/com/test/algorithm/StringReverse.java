package com.test.algorithm;

public class StringReverse {
	private static String reverse1(String s) {
		int length = s.length();
		if(length<=1)
			return s;
		String left = s.substring(0, length/2);
		String right = s.substring(length/2, length);
		return reverse1(right) + reverse1(left);
	}
	private static String reverse2(String s) {
		int length = s.length();
		String reverse = "";
		for (int i = 0; i < length; i++) {
			reverse = s.charAt(i) + reverse;
		}
		return reverse;
	}
	private static String reverse3(String s) {
		char[] array = s.toCharArray();
		String reverse = "";
		for (int i = 0; i < array.length; i++) {
			reverse = array[i] + reverse;
		}
		return reverse;
	}

	public static void main(String[] args) {
		String a = "abcdefgh";
		
//		String bString = reverse1(a);
//		System.out.println(bString);
		
//		String bString = reverse2(a);
//		System.out.println(bString);
		
		String bString = reverse3(a);
		System.out.println(bString);
	}

}
