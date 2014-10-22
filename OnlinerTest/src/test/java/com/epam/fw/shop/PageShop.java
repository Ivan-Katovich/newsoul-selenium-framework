package com.epam.fw.shop;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.epam.fw.object.Options;
import com.epam.fw.services.MultiServices;
import com.epam.fw.services.PageServices;
import com.epam.onliner.pages.*;

import static com.epam.onliner.data.ConstantData.*;

public class PageShop {
	
	private static final Logger log = Logger.getLogger(PageShop.class);
	
	public static void goToPage(String uri, WebDriver driver) {
		log.info("enter to function goToPage");
		Options options = new Options();
		options.setDriver(driver);
		driver.get(uri);
		if (PageServices.waitForPageLoaded(options)) {
			log.info("Page was loaded");
		} else {
			log.error("page dont load");
			MultiServices.errorShutdown(options);
		}
	}
	
//	public static Page goToPage(Options options) {
//		log.info("enter to function goToPage in shop");
//		Page page;
//		try {
//			switch (options.getUri()) {
//			case MAIN_PAGE_URI:
//				options.getDriver().get(MAIN_PAGE_URI);
//				page = new MainPage(options.getDriver());
//				break;
//			case CATALOG_AND_PRICE_PAGE_URI:
//				options.getDriver().get(CATALOG_AND_PRICE_PAGE_URI);
//				page = new CatalogPage(options.getDriver());
//				break;
//			case AUTO_PAGE_URI:
//				options.getDriver().get(AUTO_PAGE_URI);
//				page = new AutoPage(options.getDriver());
//				break;
//			case AUTO_FLEA_MAEKET_PAGE_URI:
//				options.getDriver().get(AUTO_FLEA_MAEKET_PAGE_URI);
//				page = new AutoFleaMarketPage(options.getDriver());
//				break;
//			case PEOPLE_PAGE_URI:
//				options.getDriver().get(PEOPLE_PAGE_URI);
//				page = new PeoplePage(options.getDriver());
//				break;
//			case REALTY_URI:
//				options.getDriver().get(REALTY_URI);
//				page = new RealtyPage(options.getDriver());
//				break;
//			case FLEA_MAEKET_PAGE_URI:
//				options.getDriver().get(FLEA_MAEKET_PAGE_URI);
//				page = new FleaMarketPage(options.getDriver());
//				break;
//			case FORUM_PAGE_URI:
//				options.getDriver().get(FORUM_PAGE_URI);
//				page = new ForumPage(options.getDriver());
//				break;
//			default:
//				page = null;
//			}
//			return page;
//		} catch (Exception e) {
//			log.error("cant get uri");
//			options.getDriver().quit();
//			return null;
//		}
//	}
	
	

}
