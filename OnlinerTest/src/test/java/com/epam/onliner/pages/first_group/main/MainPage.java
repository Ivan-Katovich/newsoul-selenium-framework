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
	
	public void bustAllPages() throws InterruptedException {
		log.info("function starts");
		WebElementsShop.clickOnElement(technologyLinc, this.driver);
		log.info("after technology");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(technologyTestLinc, this.driver);
		log.info("after technologyTest");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(peopleLinc, this.driver);
		log.info("after people");
		Thread.sleep(3000);
		WebElementsShop.clickOnElement(realtyLinc, this.driver);
		Thread.sleep(3000);
		log.error("function ends");
	}
	
	public void elementsPresentAndHasText() throws InterruptedException {
		log.info("function starts");
		WebElementsShop.assertElementPresent(technologyLinc, this.driver);
		Thread.sleep(3000);
		WebElementsShop.assertElementHasText(technologyLinc, "Технологии", this.driver);
		log.info("after technology");
		Thread.sleep(3000);
		WebElementsShop.assertElementPresent(technologyTestLinc, this.driver);
		log.info("after technologyTest");
		Thread.sleep(3000);
		WebElementsShop.assertElementPresent(peopleLinc, this.driver);
		log.info("after people");
		
	}
	
	
	
}
