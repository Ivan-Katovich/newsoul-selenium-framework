package com.epam.fw.services;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.epam.fw.object.Options;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class WebElementsServices {
	
	private static final Logger log = Logger.getLogger(WebElementsServices.class); 
    
    public static void waitElement(Options options) {
    	Wait<WebDriver> wait = new FluentWait<WebDriver>(options.getDriver())
    			.withMessage("Element was not found")
    			.withTimeout(options.getTimeout(), TimeUnit.SECONDS)
    			.pollingEvery(options.getPooling(), TimeUnit.SECONDS)
    			.ignoring(NoSuchElementException.class);
    	wait.until(ExpectedConditions.visibilityOf(options.getDriver().findElement(options.getSelector())));
    }
    
    public static boolean waitElementIsVisible(Options options) {
    	log.info("enter to function waitElementIsVisible ");
    	long time = new Date().getTime();
    	long endTime = time+options.getTimeout();
    	int pooling = options.getPooling(); 
    	
    	if (time>=endTime) {
    		log.error("Timeout is not correct ");
    		return false;
    	} else {
    		try {
    			WebElement element = options.getWebElement();
    			if (element.isDisplayed()) {
    				log.info("element is displayed ");
    				return true;
    			} else {
    				log.warn("element is not displayed now ");
    				while (!element.isDisplayed() && time <= endTime) {
    					log.info(time + " lower " + endTime );
    					try {
    						Thread.sleep(pooling);
    					} catch (InterruptedException e) {
    						log.error(e.getClass());
    					}
    					time = new Date().getTime();
    				}
    				if (time >= endTime) {
    					log.error("Element is not displayed ");
    					return false;
    				} else {
    					log.info("element is displayed now ");
    					return true;
    				}
    			}
    		}
    		catch (NoSuchElementException e) {
    			log.error(e.getClass());
    			return false;
    		}
    	}
    }
    
    public static boolean waitElementIsPresent(Options options) {
    	log.info("enter to function waitElementIsPresent ");
    	
    	long time = new Date().getTime();
    	long endTime = time+options.getTimeout();
    	int pooling = options.getPooling(); 
    	
    	if (time>=endTime) {
    		log.error("Timeout is not correct ");
    		return false;
    	} else {
    		try {
    			if (options.getDriver().findElements(options.getSelector()).size()>0) {
    				log.info("element is present ");
    				return true;
    			} else {
    				log.warn("element is not present now ");
    				while (options.getDriver().findElements(options.getSelector()).size()<1 && time <= endTime) {
    					log.info(time + " lower " + endTime );
    					try {
    						Thread.sleep(pooling);
    					} catch (InterruptedException e) {
    						log.error(e.getClass());
    					}
    					time = new Date().getTime();
    				}
    				if (time >= endTime) {
    					log.error("Element is not present ");
    					return false;
    				} else {
    					log.info("element is present now ");
    					return true;
    				}
    			}
    		}
    		catch (Exception e) {
    			log.error(e.getClass());
    			return false;
    		}
    	}
    }
    
    public static boolean waitElementIsNotVisible(Options options) {
    	log.info("enter to function waitElementIsNotVisible ");
    	long time = new Date().getTime();
    	long endTime = time+options.getTimeout();
    	int pooling = options.getPooling(); 
    	
    	if (time>=endTime) {
    		log.error("Timeout is not correct ");
    		return false;
    	} else {
    		try {
    			WebElement element = options.getWebElement();
    			if (!element.isDisplayed()) {
    				log.info("element is not displayed ");
    				return true;
    			} else {
    				log.warn("element is displayed now ");
    				while (element.isDisplayed() && time <= endTime) {
    					log.info(time + " lower " + endTime );
    					try {
    						Thread.sleep(pooling);
    					} catch (InterruptedException e) {
    						log.error(e.getClass());
    					}
    					time = new Date().getTime();
    				}
    				if (time >= endTime) {
    					log.error("Element is displayed ");
    					return false;
    				} else {
    					log.info("element is not displayed now ");
    					return true;
    				}
    			}
    		}
    		catch (NoSuchElementException e) {
    			log.error(e.getClass());
    			return false;
    		}
    	}
    }
    
    public static String getAttributeValue(Options options) {
    	log.info("enter to function getAttributeValue ");
    	try {
    		return options.getWebElement().getAttribute(options.getName());
    	} catch (Exception e) {
    		log.error("Something wrong " + e.getClass());
    		return null;
    	}
    }
    
    public static String getElementText(Options options) {
    	log.info("enter to function getText ");
    	try {
    		return options.getWebElement().getText();
    	} catch (Exception e) {
    		log.error("Something wrong " + e.getClass());
    		return null;
    	}
    }
    
    public static boolean setAttributeValue(Options options) {
    	log.info("enter to function setAttributeValue ");
    	String xpath = options.getMyElement().getXpath();
    	try {
    		JavascriptExecutor executor = (JavascriptExecutor) options.getDriver();
    		log.info("Try to execute script: document.getElementByXPath = function(sValue) { var a = this.evaluate(sValue, this, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null); if (a.snapshotLength > 0) { return a.snapshotItem(0); } };" +
    				"document.getElementByXPath(\"" + xpath + "\").setAttribute(\"" + options.getName() + "\", \"" + options.getText() +"\")");
    		executor.executeScript(
    				"document.getElementByXPath = function(sValue) { var a = this.evaluate(sValue, this, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null); if (a.snapshotLength > 0) { return a.snapshotItem(0); } };" +
    				"document.getElementByXPath(\"" + xpath + "\").setAttribute(\"" + options.getName() + "\", \"" + options.getText() +"\")"
    				);
    		return true;
    	} catch (Exception e) {
    		log.error("Something wrong " + e.getClass());
    		return false;
    	}
    }
    
    public static int getElementsNumber(Options options) {
    	log.info("enter to function getElementsNumber ");
    	String itemType = options.getMyElement().getType();
    	if (itemType == "groupOfElements") {
    		return options.getDriver().findElements(By.xpath(options.getMyElement().getXpath())).size();
    	} else {
    		log.info("Item type is " + itemType + " but needed groupOfElements ");
    		return -1;
    	}
    }
    
    public static int getElementWithTextPosition(Options options) {
    	log.info("enter to function getElementPosition ");
    	String itemType = options.getMyElement().getType();
    	int matchNumber = 0;
    	int position = 0;
    	if (itemType == "groupOfElements") {
    		List<WebElement>elements = options.getDriver().findElements(By.xpath(options.getMyElement().getXpath()));
    		for (WebElement element : elements) {
    			if (options.getText().equals(element.getText())) {
    				position = elements.indexOf(element) + 1;
    				matchNumber =+ 1;
    			}
    		}
    		if (matchNumber == 0) {
    			return 0;
    		} else {
    			if (matchNumber > 1) {
    				return -2;
    			} else {
    				return position;
    			}
    		}
    	} else {
    		log.info("Item type is " + itemType + " but needed groupOfElements ");
    		return -1;
    	}
    }
    
    public static int getElementContainsTextPosition(Options options) {
    	log.info("enter to function getElementPosition ");
    	String itemType = options.getMyElement().getType();
    	int matchNumber = 0;
    	int position = 0;
    	if (itemType == "groupOfElements") {
    		List<WebElement>elements = options.getDriver().findElements(By.xpath(options.getMyElement().getXpath()));
    		for (WebElement element : elements) {
    			if (element.getText().indexOf(options.getText()) != -1) {
    				position = elements.indexOf(element) + 1;
    				matchNumber =+ 1;
    			}
    		}
    		if (matchNumber == 0) {
    			return 0;
    		} else {
    			if (matchNumber > 1) {
    				return -2;
    			} else {
    				return position;
    			}
    		}
    	} else {
    		log.info("Item type is " + itemType + " but needed groupOfElements ");
    		return -1;
    	}
    }
     
}
