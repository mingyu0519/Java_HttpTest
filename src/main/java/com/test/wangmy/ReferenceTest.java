package com.test.wangmy;

public class ReferenceTest {
	
	public void printName(String name) {
		name = name + "pppppp";
		System.out.println(name);
	}
	
	public void changeName(StringBuilder name) {
		name.append("......");
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		String person = new String("wulitaotao");
		ReferenceTest rTest = new ReferenceTest();
//		rTest.printName(person);
//		System.out.println(person);
		StringBuilder person1 = new StringBuilder("wangnima");
		rTest.changeName(person1);
		System.out.println(person1);
	}

}