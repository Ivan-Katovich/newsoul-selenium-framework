package com.epam.onliner.pages.second_group.catalog.items;

import static com.epam.onliner.data.ConstantData.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.epam.fw.object.MyElement;
import com.epam.fw.services.WebElementsServices;
import com.epam.fw.shop.FieldsShop;
import com.epam.fw.shop.ImageShop;
import com.epam.fw.shop.PageShop;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.second_group.catalog.CatalogItemTypePage;
import com.epam.onliner.tests.OpenTest;

public class MobileItemPage extends CatalogItemTypePage{
	
	private static final Logger log = Logger.getLogger(MobileItemPage.class);
	
	public MobileItemPage(WebDriver driver) {
		super(driver);
	}
	
	public void completeFieldsWithValues() {
		PageShop.assertOnPageWithUrl("http://catalog.onliner.by/mobile/", driver);
		PageShop.assertCurrentUrlContainsStringItem("catalog", driver);
		FieldsShop.fillFormByProfile(minimumFilterProfile, driver);
		ImageShop.assertImageOnPage(topLogoImg, driver);
		WebElementsShop.clickOnElement(sortByPrice, driver);
		WebElementsShop.assertOrderOfElementsNumbers(itemsCoast, "more or equal", driver);
		PageShop.getNotErrorScreenshot("mobile_page", driver);
		WebElementsShop.setElementAttributeValue(manufacturerDmenu, "class", "psi2", driver);	
		WebElementsShop.assertElementAttributeHasValue(manufacturerDmenu, "class", "psi1", driver);

	}

}
