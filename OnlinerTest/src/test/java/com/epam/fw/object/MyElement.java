package com.epam.fw.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyElement {
	
	private String xpath;
	private String type;
	
	public MyElement() {}
	
	public MyElement(String xpath, String type) {
		this.xpath = xpath;
		this.type = type;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
