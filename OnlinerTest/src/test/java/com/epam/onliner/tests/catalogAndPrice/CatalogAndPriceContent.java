package com.epam.onliner.tests.catalogAndPrice;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.onliner.pages.second_group.catalog.CatalogPage;
import com.epam.onliner.tests.BaseTestShell;
import com.epam.onliner.tests.OpenTest;

public class CatalogAndPriceContent extends BaseTestShell{
	
	private static final Logger log = Logger.getLogger(CatalogAndPriceContent.class);
	private static CatalogPage catalogPage;
	
	@Before
	public void startTest() {
		log.info("CatalogAndPriceContent test starts");
//		if (driver.toString().equals("FirefoxDriver: firefox on XP (null)")) {
//			driver = new FirefoxDriver();
//		}
	}
	
	@Test
	public void contentElementsTest() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		catalogPage.checkTitles();
	}
	
	@Test
	public void contentElementsTest2() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		catalogPage.checkTitles();
	}
	
	@After
	public void endTest() {
		log.info("CatalogAndPriceContent test ends");
	}

}
