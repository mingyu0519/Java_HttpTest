package com.test.atest;

public class ChildClass extends AbstractTest{
	public ChildClass(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass("lilei");
		childClass.sayHi();
		childClass.sayWho();
		childClass.sayHello();
	}

	@Override
	public void sayHello() {
		System.out.println("hello......");
	}
}
