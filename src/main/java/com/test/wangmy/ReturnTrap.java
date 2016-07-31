package com.test.wangmy;

public class ReturnTrap {

	public static void main(String[] args) {
		ExitFunction();
		System.out.println(ReaturnFunction());
	}
	
	@SuppressWarnings("finally")
	public static boolean ReaturnFunction() {
		try {
			return false;
		} finally {
			return true;
		}
	}
	
	public static void ExitFunction() {
		try {
			System.out.println("Hello!");
			System.exit(0);
		} finally {
			System.out.println("Goodbye!");
		}
	}

}
