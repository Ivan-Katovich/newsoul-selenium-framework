package com.epam.onliner.pages.second_group.catalog;

import static com.epam.onliner.data.ConstantData.*;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.epam.fw.object.MyElement;
import com.epam.fw.object.Options;
import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.PageShop;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.Page;
import com.epam.onliner.pages.second_group.SecondGroupPage;
import com.epam.onliner.pages.second_group.catalog.items.MobileItemPage;

public class CatalogPage extends SecondGroupPage {
	
	private static final Logger log = Logger.getLogger(CatalogPage.class);
	
	protected static final MyElement mobilePhonesLink = new MyElement("//div[@class='b-catalogmain']/ul[3]/li[1]//a[2]", "WebElement");
	protected static final MyElement photoAndVideoTitle = new MyElement("//h1[@class='cm__h1'][4]", "title");
	protected static final MyElement catalogAndPriceTitles = new MyElement("//h1[@class='cm__h1']", "groupOfElements");
	
	
	public CatalogPage(WebDriver driver) {
		super(driver);
	}
	
	public static CatalogPage goToCatalogPage(WebDriver driver) {
		PageShop.goToPage(CATALOG_AND_PRICE_PAGE_URI, driver);
		return new CatalogPage(driver);
	}
	
	public MobileItemPage goToMobilePhonesList() {
		WebElementsShop.clickOnElement(mobilePhonesLink, this.driver);
		return new MobileItemPage(this.driver);
	}
	
	public void checkTitles() {
		WebElementsShop.assertElementsNumber(catalogAndPriceTitles, "more or equal", 35, driver);
		WebElementsShop.assertElementContainsText(photoAndVideoTitle, "Фото и Видео", driver);
		WebElementsShop.assertElementContainsTextPosition(catalogAndPriceTitles, "Фото и Видео", 4, driver);
	}
	
	

}
