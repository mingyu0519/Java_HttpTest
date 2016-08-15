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

	public static void main(String[] args) {
		String a = "abcdefgh";
		String bString = reverse1(a);
		System.out.println(bString);
	}

}
