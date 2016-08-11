package com.test.array;

import java.util.ArrayList;

public class ArrayTest {
	public static void arrayStrList() {
		ArrayList<String> nameList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			nameList.add("第" + i + "位");
			System.out.println(nameList.get(i));
		}
	}
	
	public static void arrayStr() {
		String[] nameList = new String[10];
		for (int i = 0; i < nameList.length; i++) {
			nameList[i] = "第" + i + "位";
			System.out.println(nameList[i]);
		}
	}

	public static void main(String[] args) {
//		arrayStr();
		arrayStrList();
	}

}
