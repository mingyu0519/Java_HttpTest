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
	private static String reverse4(String s) {
		return new StringBuffer(s).reverse().toString();
	}
	
	private static String reverse5(String s) {
		char[] array = s.toCharArray();
		int n = array.length -1;
		int halfLength = n/2;
		for (int i = 0; i < halfLength; i++) {
			char temp = array[i];
			array[i] = array[n-i];
			array[n-i] = temp;
		}
		return new String(array);
	}

	public static void main(String[] args) {
		String a = "abcdefgh";
		
//		String bString = reverse1(a);
//		System.out.println(bString);
		
//		String bString = reverse2(a);
//		System.out.println(bString);
		
//		String bString = reverse3(a);
//		System.out.println(bString);

//		String bString = reverse4(a);
//		System.out.println(bString);
		
		String bString = reverse5(a);
		System.out.println(bString);
	}

}
