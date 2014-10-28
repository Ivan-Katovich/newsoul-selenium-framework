package com.epam.onliner.pages.first_group.main;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.fw.object.Options;
import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.PageShop;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.Page;
import com.epam.onliner.pages.first_group.FristGroupPage;
import com.epam.onliner.pages.second_group.catalog.CatalogPage;

import static com.epam.onliner.data.ConstantData.*;

public class MainPage extends FristGroupPage {
	
	private static final Logger log = Logger.getLogger(MainPage.class);

	
	
	private WebElement forum;
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	public static MainPage goToMainPage(WebDriver driver) {
		PageShop.goToPage(MAIN_PAGE_URI, driver);
		return new MainPage(driver);
	}
	
	public CatalogPage goToCatalogPageLink () {
		WebElementsShop.clickOnElement(catalogLink, this.driver);
		return new CatalogPage (this.driver);
	}
	
	public void bustAllPages() throws InterruptedException {
		log.info("function starts");
		WebElementsShop.clickOnElement(technologyLink, this.driver);
		log.info("after technology");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(technologyTestLink, this.driver);
		log.info("after technologyTest");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(peopleLink, this.driver);
		log.info("after people");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(realtyLink, this.driver);
		Thread.sleep(3000);
		log.error("function ends");
	}
	
	public void elementsPresentAndHasText() throws InterruptedException {
		log.info("function starts");
		WebElementsShop.assertElementPresent(technologyLink, this.driver);
		Thread.sleep(3000);
		WebElementsShop.assertElementHasText(technologyLink, "Технологии", this.driver);
		log.info("after technology");
		Thread.sleep(3000);
		WebElementsShop.assertElementPresent(technologyTestLink, this.driver);
		log.info("after technologyTest");
		Thread.sleep(3000);
		WebElementsShop.assertElementPresent(peopleLink, this.driver);
		log.info("after people");
		
	}
	
	
	
}
