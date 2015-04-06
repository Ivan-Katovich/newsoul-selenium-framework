package com.epam.onliner.tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.epam.onliner.pages.Page;

public class BaseTestShell {
	
	protected static WebDriver driver;
	protected static Page page;
	
	@BeforeClass
	public static void startTestComplect() throws Exception{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//		driver = new FirefoxDriver();
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void shutdownTestComplect() throws Exception{
		driver.close();
//		Thread.sleep(1000); 
	    driver.quit();
	    Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
//	    Thread.sleep(5000);
//	    Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
//	    Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
	}

}
