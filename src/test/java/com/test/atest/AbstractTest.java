package com.test.atest;

public abstract class AbstractTest {
	private String name;
	public AbstractTest(String name) {
		this.name = name;
	}
	public void sayHi() {
		System.out.println("hi......");
	}
	
	public void sayWho() {
		System.out.println(this.name);
	}
	public abstract void sayHello();
}
