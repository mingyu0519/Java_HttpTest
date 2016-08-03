package com.test.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {
	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("src/main/resources/response.xml");
			Element element = document.getDocumentElement();
			System.out.println(element.getTagName());
			NodeList eList = element.getChildNodes();
			for (int i = 0; i < eList.getLength(); i++) {
				if (eList.item(i) instanceof Element) {
					System.out.println("--------------------------------");
					System.out.println("nodename=" + eList.item(i).getNodeName());
					System.out.println(eList.item(i).getTextContent());
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
