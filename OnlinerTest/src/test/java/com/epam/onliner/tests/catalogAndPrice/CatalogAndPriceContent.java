package com.epam.onliner.tests.catalogAndPrice;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.onliner.pages.first_group.main.MainPage;
import com.epam.onliner.pages.second_group.catalog.CatalogPage;
import com.epam.onliner.tests.BaseTestShell;
import com.epam.onliner.tests.OpenTest;

public class CatalogAndPriceContent extends BaseTestShell{
	
	private static final Logger log = Logger.getLogger(CatalogAndPriceContent.class);
	private static CatalogPage catalogPage;
	private static MainPage mainPage;
	
	
	@Before
	public void startTest() {
		log.info("\n \n=== CatalogAndPriceContent test starts === \n");
//		if (driver.toString().equals("FirefoxDriver: firefox on XP (null)")) {
//			driver = new FirefoxDriver();
//		}
	}
	
	@Test
	public void contentElementsTest() {
		mainPage = MainPage.goToMainPage(driver);
		catalogPage = mainPage.goToCatalogPageLink();
		catalogPage.checkMusicAndVideoTitle();
	}
	
	@Test
	public void contentMusicAndVideoBlockTest() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		catalogPage.checkMusicAndVideoContent();
	}
	
	@Test
	public void checkPriceSorting() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		catalogPage.checkMusicAndVideoContent();
	}
	
	@After
	public void endTest() {
		log.info("\n \n === CatalogAndPriceContent test ends === \n");
	}
	

}
