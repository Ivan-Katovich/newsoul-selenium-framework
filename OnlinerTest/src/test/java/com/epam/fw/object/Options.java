package com.epam.fw.object;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.epam.fw.services.MultiServices;
import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.WebElementsShop;

import static com.epam.onliner.data.ConstantData.*;

public class Options {
	
	private WebDriver driver;
	private WebElement webElement;
	private String uri;
	private int timeout = TIME_OUT;
	private int pooling = POOLING;
	private By selector;
	private MyElement myElement;
	private String text;
	private String name;
	private static final Logger log = Logger.getLogger(Options.class);
	
	public Options() {}
	
//	public WebElement setElementBy() {
//		if (Services.waitElementIsPresent(this)) {
//			
//			this.setElement(this.getDriver().findElement(this.getSelector()));
//		} else {
//			log.error("can't find element");
//			this.getDriver().quit();
//		}
//    	return this.getElement();
//    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWebElement() {
		return webElement;
	}

	public void setWebElement(WebElement element) {
		this.webElement = element;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getPooling() {
		return pooling;
	}

	public void setPooling(int pooling) {
		this.pooling = pooling;
	}

	public By getSelector() {
		return selector;
	}

	public void setSelector(By selector) {
		this.selector = selector;
	}

	public MyElement getMyElement() {
		return myElement;
	}

	public void setMyElement(MyElement myElement) {
		this.myElement = myElement;
		this.selector = By.xpath(myElement.getXpath());
		if (!WebElementsServices.waitElementIsPresent(this)) {
			log.error("Element with xpath = " + myElement.getXpath() + " is not present");
			MultiServices.errorShutdown(this);
		} else {
			this.webElement = this.driver.findElement(By.xpath(myElement.getXpath()));
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String attributeName) {
		this.name = attributeName;
	}
	
	
	

}
