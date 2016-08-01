package com.test.atest;

public class InterfaceTest implements InterfaceA{
	public void eat() {
		System.out.println("it's eat......");
	}
	public static void main(String[] args) {
		InterfaceTest iTest = new InterfaceTest();
		iTest.eat();
	}
}
