package com.epam.fw.shop;

import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.epam.fw.object.MyElement;
import com.epam.fw.object.Options;
import com.epam.fw.services.FieldsServices;
import com.epam.fw.services.MultiServices;
import com.epam.fw.services.WebElementsServices;

public class WebElementsShop {
	
	private static final Logger log = Logger.getLogger(WebElementsShop.class);
	
	public static void assertElementVisible(MyElement myElement, WebDriver driver) {
		log.info("enter to function assertElementVisible");
		Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		if (WebElementsServices.waitElementIsVisible(options)) {
			log.info("element is visible" );
		} else {
			log.error("element is not visible shutdown" );
			MultiServices.errorShutdown(options);
		}
	}
	
	public static void assertElementPresent(MyElement myElement, WebDriver driver) {
		log.info("enter to function assertElementPresent");
		Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		if (WebElementsServices.waitElementIsPresent(options)) {
			log.info("element is present" );
		} else {
			log.error("element is not present shutdown" );
			MultiServices.errorShutdown(options);
		}
	}
    
    public static void clickOnElement(MyElement myElement, WebDriver driver) {
    	log.info("enter to function clickOnElement");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		if (WebElementsServices.waitElementIsVisible(options)) {
			log.info("visible true");
			driver.findElement(options.getSelector()).click();
		} else {
			log.info("visible false shutdown");
			MultiServices.errorShutdown(options);
		}
	}
    
    public static void assertElementHasText(MyElement myElement, String expectedText, WebDriver driver) {
    	log.info("enter to function assertElementHasText");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
    	if (!WebElementsServices.waitElementIsVisible(options)) {
    		log.error("Element is not visible shutdown" );
    		MultiServices.errorShutdown(options);
    	} else {
    		String text = WebElementsServices.getElementText(options);
    		if (text == null || !text.equals(expectedText)) {
    			log.error(myElement.getXpath());
    			log.error("Element has text '" + text + "' but expexted '" + expectedText + "' shutdown");
    			MultiServices.errorShutdown(options);
    		} else {
    			log.info("Element has text '" + text + "' expexted '" + expectedText);
    		}
    	}
    }
    
    public static void assertElementContainsText(MyElement myElement, String expectedText, WebDriver driver) {
    	log.info("enter to function assertElementContainsText");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
    	if (!WebElementsServices.waitElementIsVisible(options)) {
    		log.error("Element is not visible shutdown" );
    		MultiServices.errorShutdown(options);
    	} else {
    		String text = WebElementsServices.getElementText(options);
    		if (text == null || text.indexOf(expectedText) == -1) {
    			log.error("Element has text '" + text + "' not contains '" + expectedText + "' shutdown");
    			MultiServices.errorShutdown(options);
    		} else {
    			log.info("Element has text '" + text + "' contains '" + expectedText);
    		}
    	}
    }
    
    public static void assertElementAttributeHasValue(MyElement myElement, String attributeName, String attributeValue, WebDriver driver) {
    	log.info("enter to function assertElementContainsText");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		options.setName(attributeName);
		if (!WebElementsServices.waitElementIsVisible(options)) {
    		log.error("Element is not visible shutdown" );
    		MultiServices.errorShutdown(options);
    	} else {
    		String value = WebElementsServices.getAttributeValue(options);
    		if (value == null || !value.equals(attributeValue)) {
    			log.error("Element has attribute '" + attributeName + "' with value '" + value + "' but expexted value '" + attributeValue + "' shutdown");
    			MultiServices.errorShutdown(options);
    		} else {
    			log.info("Element has attribute '" + attributeName + "' with value '" + value + "' expexted value '" + attributeValue);
    		}
    	}
    }
    
    public static void setElementAttributeValue(MyElement myElement, String attributeName, String attributeValue, WebDriver driver) {
    	log.info("enter to function setElementAttributeValue");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		options.setName(attributeName);
		options.setText(attributeValue);
		if (!WebElementsServices.waitElementIsVisible(options)) {
    		log.error("Element is not visible shutdown" );
    		MultiServices.errorShutdown(options);
		} else {
			if (WebElementsServices.setAttributeValue(options)) {
				if (WebElementsServices.getAttributeValue(options).equals(attributeValue)) {
					log.info("attribute '" + attributeName + "' value is seted to '" + attributeValue + "'");
				} else {
					log.info("attribute '" + attributeName + "' value isn't seted to '" + attributeValue + "'");
					MultiServices.errorShutdown(options);
				}
			} else {
				log.error("can't set this value in this attribute" );
	    		MultiServices.errorShutdown(options);
			}
		}
    }
    
    public static void assertElementsNumber(MyElement myElement, String compareType, int expectedNumber, WebDriver driver) {
    	log.info("enter to function assertElementsNumber");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
    	int itemNumber = WebElementsServices.getElementsNumber(options);
    	if (itemNumber == -1) {
    		log.error("Element has not right type " );
    		MultiServices.errorShutdown(options);
    	} else {
    		switch (compareType) {
			case "equal":
				if (itemNumber != expectedNumber) {
					log.error("Item number " + itemNumber + " is not equal to expected number " + expectedNumber);
					MultiServices.errorShutdown(options);
				} else {
					log.info("Item number " + itemNumber + " is equal to expected number " + expectedNumber);
				}
				break;
			case "more":
				if (itemNumber <= expectedNumber) {
					log.error("Item number " + itemNumber + " is less or equal to expected number " + expectedNumber);
					MultiServices.errorShutdown(options);
				} else {
					log.info("Item number " + itemNumber + " is more than expected number " + expectedNumber);
				}
				break;
			case "less":
				if (itemNumber >= expectedNumber) {
					log.error("Item number " + itemNumber + " is more or equal to expected number " + expectedNumber);
					MultiServices.errorShutdown(options);
				} else {
					log.info("Item number " + itemNumber + " is less than expected number " + expectedNumber);
				}
				break;
			case "more or equal":
				if (itemNumber < expectedNumber) {
					log.error("Item number " + itemNumber + " is less than expected number " + expectedNumber);
					MultiServices.errorShutdown(options);
				} else {
					log.info("Item number " + itemNumber + " is more or equal to expected number " + expectedNumber);
				}
				break;
			case "less or equal":
				if (itemNumber > expectedNumber) {
					log.error("Item number " + itemNumber + " is more than expected number " + expectedNumber);
					MultiServices.errorShutdown(options);
				} else {
					log.info("Item number " + itemNumber + " is less or equal to expected number " + expectedNumber);
				}
				break;
			default:
				log.error("Compare type is wrong. It can be only equal/more/less/more or equal/less or equal " );
				MultiServices.errorShutdown(options);
			}
    	}
    }
    
    public static void assertElementPosition(MyElement myElement, String elementText, int expectedPosition, WebDriver driver) {
    	log.info("enter to function assertElementPosition");
    	Options options = new Options();
		options.setDriver(driver);
		options.setMyElement(myElement);
		options.setText(elementText);
		int position = WebElementsServices.getElementWithTextPosition(options);
		if (position == -1) {
			log.error("Element has not right type " );
			MultiServices.errorShutdown(options);
		} else {
			if (position == 0) {
				log.error("Noone element with expected text " );
				MultiServices.errorShutdown(options);
			} else {
				if (position == -2) {
					log.error("More than one element with expected text " );
					MultiServices.errorShutdown(options);
				} else {
					if (position != expectedPosition) {
						log.error("Item position is " + position + " but expected " + expectedPosition);
						MultiServices.errorShutdown(options);
					} else {
						log.info("Item position is " + position + " is equal to expected " + expectedPosition);
					}
				}
			}
		}
    }
 

}