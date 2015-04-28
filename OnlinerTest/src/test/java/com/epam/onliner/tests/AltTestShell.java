package com.epam.onliner.tests;

import static com.epam.onliner.data.ConstantData.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.epam.onliner.pages.Page;

public class AltTestShell {
	
	protected static WebDriver driver;
//	protected static Page page;
	
	@BeforeClass
	public static void startAltTestComplect() throws Exception{
		URL gridHost = new URL("http://"+SELENIUM_HOST_HOME+":"+SELENIUM_PORT+"/wd/hub");
//		URL gridHost = new URL("http://localhost:4444/wd/hub");
//		URL gridHost = new URL("http://192.168.0.101:4444/wd/hub");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(gridHost, capability);
//		driver = new FirefoxDriver();
//	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void shutdownAltTestComplect() throws Exception{
		driver.close();
//		Thread.sleep(1000); 
	    driver.quit();
//	    Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
//	    Thread.sleep(5000);
//	    Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
//	    Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
	}

}
