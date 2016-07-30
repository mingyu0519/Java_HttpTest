package com.test.wangmy;

public class TestStatic {

	private static int x = 100;
	
	public static void main(String[] args) {
		TestStatic tStatic = new TestStatic();
		tStatic.x++;
		TestStatic tStatic2 = new TestStatic();
		tStatic2.x++;
		tStatic = new TestStatic();
		tStatic.x++;
		TestStatic.x--;
		System.out.println("x=" + x);
	}

}
