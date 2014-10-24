package com.epam.onliner.pages;

import org.openqa.selenium.WebDriver;

import com.epam.fw.object.MyElement;

public abstract class Page {
	
	protected static final MyElement topLogo = new MyElement("topLogo", "//img[@class='onliner_logo retina-off']", "webelement");
	
	protected final WebDriver driver;
	
	public Page(WebDriver driver) {
        this.driver = driver;
    }

	public WebDriver getDriver() {
		return this.driver;
	}

}
