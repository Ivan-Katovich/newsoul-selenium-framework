package com.epam.fw.services;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.epam.fw.object.Options;

public class MultiServices {
	
	private static final Logger log = Logger.getLogger(MultiServices.class);
	
	public static void errorShutdown(Options options) {
		log.info("enter to function errorShutdown");
		String path = getMyScreenshot(options);
		log.error("You can see screenshot with error '" + path + "'");
//		options.getDriver().quit();
		Thread.currentThread().stop();;
	}
	
	public static String getMyScreenshot(Options options) {
		log.info("enter to function getScreenshot");
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy hh;mm;ss SSS zzz");
		Date date = new Date(); 
		String formattedDate; 
		if (options.getName() == null) {
			formattedDate= df.format(date);
		} else {
			formattedDate= df.format(date) + " " + options.getName();
		}
		File file = ((TakesScreenshot) options.getDriver()).getScreenshotAs(OutputType.FILE);
		String path = "src/test/resources/screenshots/" + formattedDate + ".png";
		File screen = new File(path);
		try {
			FileUtils.copyFile(file, screen);
			return screen.getAbsolutePath();
		} catch (IOException e) {
			return null;
		}
	}

}
