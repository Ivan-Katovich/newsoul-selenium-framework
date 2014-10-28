package com.epam.onliner.pages.first_group;

import org.openqa.selenium.WebDriver;

import com.epam.fw.object.MyElement;
import com.epam.onliner.pages.Page;

public abstract class FristGroupPage extends Page{
	
	protected static final MyElement catalogLink = new MyElement("catalogLink", "//li[contains(@class,'b-main-navigation__item')][1]/a", "webElement");
	protected static final MyElement technologyLink = new MyElement("technologyLink", "//li[contains(@class,'b-main-navigation__item')][2]/a", "webElement");
	protected static final MyElement technologyTestLink = new MyElement("technologyTestLink", "//li[contains(@class,'b-main-navigation__item_test')][2]/a", "webElement");
	protected static final MyElement autoLink = new MyElement("autoLink", "//li[contains(@class,'b-main-navigation__item')][3]/a[1]", "webElement");
	protected static final MyElement autoFleaLink = new MyElement("autoFleaLink", "//li[contains(@class,'b-main-navigation__item')][3]/a[2]", "webElement");
	protected static final MyElement peopleLink = new MyElement("peopleLink", "//li[contains(@class,'b-main-navigation__item')][4]/a", "webElement");
	protected static final MyElement realtyLink = new MyElement("realtyLink", "//li[contains(@class,'b-main-navigation__item')][5]/a", "webElement");
	protected static final MyElement fleaMarketLink = new MyElement("fleaMarketLink", "//li[contains(@class,'b-main-navigation__item')][6]/a", "webElement");
	protected static final MyElement forumLink = new MyElement("forumLink", "//li[contains(@class,'b-main-navigation__item')][7]/a", "webElement");
	
	public FristGroupPage(WebDriver driver) {
		super(driver);
	}

}
