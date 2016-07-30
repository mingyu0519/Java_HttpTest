package com.test.wangmy;

public class OverloadTest {
	public OverloadTest() {
		System.out.println("test");
	}
	
	public OverloadTest(String name){
		System.out.println(name + "test");
	}

	public OverloadTest(int age){
		System.out.println(age + "test");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		OverloadTest oTest = new OverloadTest();
		OverloadTest oTest1 = new OverloadTest(11);
		OverloadTest oTest2 = new OverloadTest("name");
	}

}
