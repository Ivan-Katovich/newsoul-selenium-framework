package com.epam.onliner.pages.second_group.catalog.items;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.epam.fw.object.MyElement;
import com.epam.fw.shop.WebElementsShop;
import com.epam.onliner.pages.second_group.catalog.CatalogItemTypePage;

public class PhotoAndVideoPage extends CatalogItemTypePage{
	
private static final Logger log = Logger.getLogger(PhotoAndVideoPage.class);

	
	public PhotoAndVideoPage(WebDriver driver) {
		super(driver);
	}
	
	public void checkOrderOfPrices() {
		WebElementsShop.assertOrderOfElementsNumbers(itemsCoast, "more or equal", driver);
	}
	
	

}
