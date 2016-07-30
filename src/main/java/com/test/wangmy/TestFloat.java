package com.test.wangmy;

import java.math.BigDecimal;

public class TestFloat {

	public static void main(String[] args) {
		System.out.println(2.0 - 1.1);
		BigDecimal a1 = new BigDecimal(Double.toString(2.0));
		BigDecimal a2 = new BigDecimal(Double.toString(1.1));
		System.out.println(a1.subtract(a2).doubleValue());
	}

}
