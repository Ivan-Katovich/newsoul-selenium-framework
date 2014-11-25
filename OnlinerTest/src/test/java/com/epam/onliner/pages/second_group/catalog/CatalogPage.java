package com.epam.onliner.pages.second_group.catalog;

import static com.epam.onliner.data.ConstantData.*;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.epam.fw.object.MyElement;
import com.epam.fw.object.MyImage;
import com.epam.fw.object.Options;
import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.ImageShop;
import com.epam.fw.shop.PageShop;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.Page;
import com.epam.onliner.pages.second_group.SecondGroupPage;
import com.epam.onliner.pages.second_group.catalog.items.MobileItemPage;
import com.epam.onliner.pages.second_group.catalog.items.PhotoAndVideoPage;

public class CatalogPage extends SecondGroupPage {
	
	private static final Logger log = Logger.getLogger(CatalogPage.class);
	
	protected static final MyElement mobilePhonesLink = new MyElement("mobilePhonesLink", "//div[@class='b-catalogmain']/ul[3]/li[1]//a[2]", "WebElement");
	protected static final MyElement photoCamerasLink = new MyElement("photoCamerasLink", "//div[@class='b-catalogmain']/ul[4]/li[1]//a[2]", "WebElement");
	protected static final MyElement photoAndVideoLink = new MyElement("photoAndVideoLink", "//h1[@class='cm__h1'][4]", "WebElement");
	protected static final MyElement photoAndVideoItemsNum = new MyElement("photoAndVideoItemsNum", "//h1[@class='cm__h1'][4]/sup", "WebElement");
	protected static final MyElement photoCameraMinCoast = new MyElement("photoCameraMinCoast", "//ul[@class='b-catalogitems'][4]/descendant::sup[1]/a", "WebElement");
	
	protected static final MyElement catalogAndPriceTitles = new MyElement("catalogAndPriceTitles", "//h1[@class='cm__h1']", "groupOfElements");
	protected static final MyElement photoAndVideoElements = new MyElement("photoAndVideoElements", "//ul [@class='b-catalogitems'][4]/li", "groupOfElements");
	protected static final MyElement photoAndVideoMinElementsCoast = new MyElement("photoAndVideoMinElementsCoast", "//ul[@class='b-catalogitems'][4]//sup/a", "groupOfElements");
	
	protected static final MyImage photoAndVideoSectionImg = new MyImage("photoAndVideoSectionImg", "src/test/resources/imgs/Photo_and_video_section.png", "body");
	
	
	public CatalogPage(WebDriver driver) {
		super(driver);
	}
	
	public static CatalogPage goToCatalogPage(WebDriver driver) {
		PageShop.goToPage(CATALOG_AND_PRICE_PAGE_URI, driver);
		return new CatalogPage(driver);
	}
	
	public MobileItemPage goToMobilePhonesLink() {
		WebElementsShop.clickOnElement(mobilePhonesLink, this.driver);
		return new MobileItemPage(this.driver);
	}
	
	public PhotoAndVideoPage goToPhotoCamerasSortByPriceLink() {
		WebElementsShop.clickOnElement(photoCameraMinCoast, this.driver);
		return new PhotoAndVideoPage(this.driver);
	}
	
	public void checkMusicAndVideoTitle() {
		WebElementsShop.assertElementsNumber(catalogAndPriceTitles, "equal", 45, driver);
		WebElementsShop.assertElementContainsTextPosition(catalogAndPriceTitles, "Фото и Видео", 4, driver);
	}
	
	public void checkMusicAndVideoContent() {
		WebElementsShop.assertElementContainsNumber(photoAndVideoItemsNum, driver);
		WebElementsShop.assertElementsNumber(photoAndVideoElements, "equal", 12, driver);
		WebElementsShop.assertElementsNumber(photoAndVideoMinElementsCoast, "equal", 12, driver);
		WebElementsShop.assertElementContainsText(photoCameraMinCoast, "у.е.", driver);
		WebElementsShop.assertElementAttributeHasValue(photoCameraMinCoast, "href", "http://catalog.onliner.by/photo/~sort_by=price/", driver);
		ImageShop.assertImageOnPage(photoAndVideoSectionImg, driver);
	}
	
	public void checkDifferentRedirects() {
		PageShop.assertOnPageWithUrl("http://catalog.onliner.by/photo/~sort_by=price/", driver);
		
	}
	
	

}
