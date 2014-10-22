package com.epam.onliner.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.fw.object.MyElement;

public final class MainPageElements {
	
	// MyElements
	public static final MyElement CATALOG_AND_PRICE = new MyElement("//li[contains(@class,'b-main-navigation__item')][1]/a", "WebElement");
	public static final MyElement TECHNOLOGY = new MyElement("//li[contains(@class,'b-main-navigation__item')][2]/a", "WebElement");
	public static final MyElement TECHNOLOGY_TEST = new MyElement("//li[contains(@class,'b-main-navigation__item_test')][2]/a", "WebElement");
	public static final MyElement AUTO = new MyElement("//li[contains(@class,'b-main-navigation__item')][3]/a[1]", "WebElement");
	public static final MyElement AUTO_FLEA_MARKET = new MyElement("//li[contains(@class,'b-main-navigation__item')][3]/a[2]", "WebElement");
	public static final MyElement PEOPLEE = new MyElement("//li[contains(@class,'b-main-navigation__item')][4]/a", "WebElement");
	public static final MyElement REALTY = new MyElement("//li[contains(@class,'b-main-navigation__item')][5]/a", "WebElement");
	public static final MyElement FLEA_MARKET = new MyElement("//li[contains(@class,'b-main-navigation__item')][6]/a", "WebElement");
	public static final MyElement FORUM = new MyElement("//li[contains(@class,'b-main-navigation__item')][7]/a", "WebElement");
}

