package com.epam.onliner.pages.second_group.catalog.items;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.FieldsShop;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.second_group.catalog.CatalogItemTypePage;
import com.epam.onliner.tests.OpenTest;

public class MobileItemPage extends CatalogItemTypePage{
	
	private static final Logger log = Logger.getLogger(MobileItemPage.class);
	
	public MobileItemPage(WebDriver driver) {
		super(driver);
	}
	
	public void completeFieldsWithValues() throws InterruptedException {
		FieldsShop.fillFormByProfile(minimumFilterProfile, driver);
//		FieldsShop.fillFieldByValue(manufacturerDmenu, "Apple", driver);
//		FieldsShop.fillFieldByValue(priceMinIn, "300", driver);
//		FieldsShop.fillFieldByValue(priceMaxIn, "500", driver);
//		Select sel = new Select(driver.findElement(By.xpath(manufacturerDmenu.getXpath())));
//		sel.selectByVisibleText("Apple");
//		WebElementsShop.clickOnElement(manufacturerDmenuApple, driver);
		WebElementsShop.assertElementHasText(priceMinIn, "hi hi", driver);
		WebElementsShop.setElementAttributeValue(manufacturerDmenu, "class", "psi2", driver);	
		Thread.sleep(1000);
		WebElementsShop.assertElementAttributeHasValue(manufacturerDmenu, "class", "psi2", driver);

	}

}
