package com.test.interview;

public class VariableTest {
	public void variableBasicTest() {
		// byte
		System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		// short
		System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
		System.out.println("包装类：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		// int
		System.out.println("基本类型：Integer 二进制位数：" + Integer.SIZE);
		System.out.println("包装类：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		// long
		System.out.println("基本类型：Long 二进制位数：" + Long.SIZE);
		System.out.println("包装类：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		// float
		System.out.println("基本类型：Float 二进制位数：" + Float.SIZE);
		System.out.println("包装类：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		// double
		System.out.println("基本类型：Double 二进制位数：" + Double.SIZE);
		System.out.println("包装类：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		// char
		System.out.println("基本类型：Character 二进制位数：" + Character.SIZE);
		System.out.println("包装类：java.lang.Character");
		System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
	}
	
	public void variableFinalTest() {
		final double PI = 3.1415927;
		System.out.println(PI);
		int age = 0;
		age = age + 1;
	}

	public static void main(String[] args) {
		VariableTest vTest = new VariableTest();
//		vTest.variableBasicTest();
		vTest.variableFinalTest();
	}
}
