package com.epam.onliner.tests;

import static com.epam.onliner.data.ConstantData.*;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.*;
import com.epam.onliner.pages.first_group.main.MainPage;
import com.epam.onliner.pages.second_group.catalog.CatalogItemTypePage;
import com.epam.onliner.pages.second_group.catalog.CatalogPage;
import com.epam.onliner.pages.second_group.catalog.items.MobileItemPage;

public class Open extends BaseTestShell{
	
	private static final Logger log = Logger.getLogger(Open.class);
	private static MainPage mainPage;
	private static CatalogPage catalogPage;
	private static CatalogItemTypePage catalogItemType;
	private static MobileItemPage mobileItemPage;
	
	@Before
	public void startTest() {
//		http://adeptqa.blogspot.com/2012/12/seleniumtestng-20.html
//		DOMConfigurator.configure("./log4j.xml");
		log.info("\n \n === Open test starts === \n");
	}
	
//	@Test
//	public void welcomeMyRrameworkTest() throws InterruptedException {
//		mainPage = MainPage.goToMainPage(driver);
//		log.info("mainPage maked");
////		mainPage.bustAllPages();
//		mainPage.elementsPresentAndHasText();
//		log.info("function works");
//	}
	
	@Test
	public void fillFilterFormTest() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		log.info("catalogPage was created");
		mobileItemPage = catalogPage.goToMobilePhonesLink();
		mobileItemPage.completeFieldsWithValues();
	}
	
	@Test
	public void fillFilterFormTest2() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		log.info("catalogPage was created");
		mobileItemPage = catalogPage.goToMobilePhonesLink();
		mobileItemPage.completeFieldsWithValues();
	}
	
	@After
	public void endTest() {
		log.info("\n \n === Open test ends === \n");
	}

}
