package com.test.wangmy;

public class InterfaceTest implements InterfaceA{
	public void eat() {
		System.out.println("aaaaa");
	}

	public static void main(String[] args) {
		InterfaceTest interfaceTest = new InterfaceTest();
		interfaceTest.eat();
		System.out.println(InterfaceA.className);
	}

}
