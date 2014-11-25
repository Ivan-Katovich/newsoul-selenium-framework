package com.epam.onliner.tests.catalogAndPrice;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.onliner.pages.first_group.main.MainPage;
import com.epam.onliner.pages.second_group.catalog.CatalogPage;
import com.epam.onliner.pages.second_group.catalog.items.PhotoAndVideoPage;
import com.epam.onliner.tests.BaseTestShell;
import com.epam.onliner.tests.OpenTest;

public class CatalogAndPriceContent extends BaseTestShell{
	
	private static final Logger log = Logger.getLogger(CatalogAndPriceContent.class);
	private static CatalogPage catalogPage;
	private static MainPage mainPage;
	private static PhotoAndVideoPage photoAndVideoPage;
	
	
	@Before
	public void startTest() {
		log.info("\n \n=== CatalogAndPriceContent test starts === \n");
//		if (driver.toString().equals("FirefoxDriver: firefox on XP (null)")) {
//			driver = new FirefoxDriver();
//		}
	}
	
	@Test
	public void contentElementsTest() {
		log.info("\n \n=== contentElementsTest test executing === \n");
		mainPage = MainPage.goToMainPage(driver);
		catalogPage = mainPage.goToCatalogPageLink();
		catalogPage.checkMusicAndVideoTitle();
	}
	
	@Test
	public void contentMusicAndVideoBlockTest() {
		log.info("\n \n=== contentMusicAndVideoBlockTest test executing === \n");
		catalogPage = CatalogPage.goToCatalogPage(driver);
		catalogPage.checkMusicAndVideoContent();
	}
	
	@Test
	public void checkPriceSorting() {
		catalogPage = CatalogPage.goToCatalogPage(driver);
		photoAndVideoPage = catalogPage.goToPhotoCamerasSortByPriceLink();
	}
	
	@After
	public void endTest() {
		log.info("\n \n === CatalogAndPriceContent test ends === \n");
	}
	

}
