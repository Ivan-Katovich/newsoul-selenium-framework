package com.epam.onliner.pages;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;

import com.epam.fw.object.MyElement;

public abstract class Page {
	
	protected static final MyElement topLogo = new MyElement("topLogo", "//img[@class='onliner_logo retina-off']", "webelement");
	protected static final Pattern topLogoImg = new Pattern("src/test/resources/imgs/Onliner_logo.png");
	
	protected final WebDriver driver;
	
	public Page(WebDriver driver) {
        this.driver = driver;
    }

	public WebDriver getDriver() {
		return this.driver;
	}

}
