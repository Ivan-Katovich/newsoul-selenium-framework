package com.epam.fw.shop;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.epam.fw.services.MultiServices;

import static com.epam.onliner.data.ConstantData.*;

public class ImageShop extends Shop {
	
	private static final Logger log = Logger.getLogger(ImageShop.class);
	
	public static void assertImageOnPage(Pattern image, WebDriver driver) {
		log.info("enter to function assertImageOnPage ");
		Screen screen = new Screen();
		try {
			screen.wait(image, TIME_OUT);
			log.info("image was found ");
		} catch (FindFailed e) {
			log.error("can't find this image ");
			MultiServices.errorShutdown(options);
		}
	}

}
