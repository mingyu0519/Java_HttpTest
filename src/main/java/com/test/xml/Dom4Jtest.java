package com.test.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Dom4Jtest {
	public static void main(String[] args) {
		String xmlStr = "<root><people>jobs</people></root>";
		try {
			
			Document document = DocumentHelper.parseText(xmlStr);
			
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
