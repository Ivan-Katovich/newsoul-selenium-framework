package com.epam.onliner.pages.first_group;

import org.openqa.selenium.WebDriver;

import com.epam.fw.object.MyElement;
import com.epam.onliner.pages.Page;

public abstract class FristGroupPage extends Page{
	
	protected static final MyElement catalogLinc = new MyElement("catalogLinc", "//li[contains(@class,'b-main-navigation__item')][1]/a", "webElement");
	protected static final MyElement technologyLinc = new MyElement("technologyLinc", "//li[contains(@class,'b-main-navigation__item')][2]/a", "webElement");
	protected static final MyElement technologyTestLinc = new MyElement("technologyTestLinc", "//li[contains(@class,'b-main-navigation__item_test')][2]/a", "webElement");
	protected static final MyElement autolinc = new MyElement("autolinc", "//li[contains(@class,'b-main-navigation__item')][3]/a[1]", "webElement");
	protected static final MyElement autoFleaLink = new MyElement("autoFleaLink", "//li[contains(@class,'b-main-navigation__item')][3]/a[2]", "webElement");
	protected static final MyElement peopleLinc = new MyElement("peopleLinc", "//li[contains(@class,'b-main-navigation__item')][4]/a", "webElement");
	protected static final MyElement realtyLinc = new MyElement("realtyLinc", "//li[contains(@class,'b-main-navigation__item')][5]/a", "webElement");
	protected static final MyElement fleaMarketLinc = new MyElement("fleaMarketLinc", "//li[contains(@class,'b-main-navigation__item')][6]/a", "webElement");
	protected static final MyElement forumLinc = new MyElement("forumLinc", "//li[contains(@class,'b-main-navigation__item')][7]/a", "webElement");
	
	public FristGroupPage(WebDriver driver) {
		super(driver);
	}

}
