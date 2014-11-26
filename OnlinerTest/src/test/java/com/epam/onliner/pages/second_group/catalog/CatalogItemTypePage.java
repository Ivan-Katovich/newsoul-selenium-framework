package com.epam.onliner.pages.second_group.catalog;


import java.util.LinkedHashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.epam.fw.object.MyElement;
import com.epam.fw.shop.FieldsShop;

public class CatalogItemTypePage extends CatalogPage {
	
	private static final Logger log = Logger.getLogger(CatalogItemTypePage.class);
	
	//filter's form
	protected static final MyElement manufacturerDmenu = new MyElement("manufacturerDmenu", "//form[@name='filter']//select[@id='lmfr0']", "dropdown");
	protected static final MyElement manufacturerDmenuApple = new MyElement("manufacturerDmenuApple", "//form[@name='filter']//select[@id='lmfr0']//*[text()='Apple']", "dropdown");
//	protected static final MyElement PRICE_DOUBLE_IN = new MyElement(By.xpath("PRICE_DOUBLE_IN", "//form[@name='filter']//input[@id='smth2']/../"), "text");
	protected static final MyElement priceMinIn = new MyElement("priceMinIn", "//form[@name='filter']//input[@id='smth2']", "text");
	protected static final MyElement priceMaxIn = new MyElement("priceMaxIn", "//form[@name='filter']//input[@id='smth3']", "text");
	protected static final MyElement dateOfEntryIn = new MyElement("dateOfEntryIn", "//form[@name='filter']//input[@id='lbirthday']", "text");
	protected static final MyElement mobileTypeDmenu = new MyElement("mobileTypeDmenu", "//form[@name='filter']//select[@id='lmobile_type0']", "dropdown");
	protected static final MyElement oSDmenu = new MyElement("oSDmenu", "//form[@name='filter']//select[@id='lsmart0']", "dropdown");
	protected static final MyElement coreNumberMinIn = new MyElement("coreNumberMinIn", "//form[@name='filter']//input[@name='sp[numberofcoresmob][from]']", "text");
	protected static final MyElement coreNumberMaxIn = new MyElement("coreNumberMaxIn", "//form[@name='filter']//input[@name='sp[numberofcoresmob][to]']", "text");
	protected static final MyElement procSpeedMinIn = new MyElement("procSpeedMinIn", "//form[@name='filter']//input[@name='sp[cpu_freq][from]']", "text");
	protected static final MyElement procSpeedMaxIn = new MyElement("procSpeedMaxIn", "//form[@name='filter']//input[@name='sp[cpu_freq][to]']", "text");
	protected static final MyElement sensScreenDmenu = new MyElement("sensScreenDmenu", "//form[@name='filter']//select[@id='lsens_screen']", "dropdown");
	protected static final MyElement displSizeMinDmenu = new MyElement("displSizeMinDmenu", "//form[@name='filter']//select[@id='lmob_displaydiag']", "dropdown");
	protected static final MyElement displSizeMaxDmenu = new MyElement("displSizeMaxDmenu", "//form[@name='filter']//select[@id='lmob_displaydiag_2']", "dropdown");
	protected static final MyElement displResolMinDmenu = new MyElement("displResolMinDmenu", "//form[@name='filter']//select[@id='lmob_displayresol']", "dropdown");
	protected static final MyElement displResolMaxDmenu = new MyElement("displResolMaxDmenu", "//form[@name='filter']//select[@id='lmob_displayresol_2']", "dropdown");
	protected static final MyElement camMpxMinIn = new MyElement("camMpxMinIn", "//form[@name='filter']//input[@name='sp[cam_mpx][from]']", "text");
	protected static final MyElement camMpxMaxIn = new MyElement("camMpxMaxIn", "//form[@name='filter']//input[@name='sp[cam_mpx][to]']", "text");
	protected static final MyElement ramSizeMinIn = new MyElement("ramSizeMinIn", "//form[@name='filter']//input[@name='sp[mem_share][from]']", "text");
	protected static final MyElement ramUnitsMinDmenu = new MyElement("ramUnitsMinDmenu", "//form[@name='filter']//select[@name='sp[mem_share][from_ratio]']", "dropdown");
	protected static final MyElement ramSizeMaxIn = new MyElement("ramSizeMaxIn", "//form[@name='filter']//input[@name='sp[mem_share][to]']", "text");
	protected static final MyElement ramUnitsMaxDmenu = new MyElement("ramUnitsMaxDmenu", "//form[@name='filter']//select[@name='sp[mem_share][to_ratio]']", "dropdown");
	protected static final MyElement memSizeMinIn = new MyElement("memSizeMinIn", "//form[@name='filter']//input[@name='sp[mem_flash][from]']", "text");
	protected static final MyElement memUnitsMinDmenu = new MyElement("memUnitsMinDmenu", "//form[@name='filter']//select[@name='sp[mem_flash][from_ratio]']", "dropdown");
	protected static final MyElement memSizeMaxIn = new MyElement("memSizeMaxIn", "//form[@name='filter']//input[@name='sp[mem_flash][to]']", "text");
	protected static final MyElement memUnitsMaxDmenu = new MyElement("memUnitsMaxDmenu", "//form[@name='filter']//select[@name='sp[mem_flash][to_ratio]']", "dropdown");
	protected static final MyElement memCardsDmenu = new MyElement("memCardsDmenu", "//form[@name='filter']//select[@id='lmemcards']", "dropdown");
	protected static final MyElement dualSimmenu = new MyElement("dualSimmenu", "//form[@name='filter']//select[@id='ldual_sim']", "dropdown");
	protected static final MyElement caseTypeDmenu = new MyElement("caseTypeDmenu", "//form[@name='filter']//select[@id='lcase_type0']", "dropdown");
	protected static final MyElement caseDefDmenu = new MyElement("caseDefDmenu", "//form[@name='filter']//select[@id='lmp_ruggedcase']", "dropdown");
	protected static final MyElement accCapacityMinIn = new MyElement("accCapacityMinIn", "//form[@name='filter']//input[@name='sp[acc_capacity][from]']", "text");
	protected static final MyElement accCapacityMaxIn = new MyElement("accCapacityMaxIn", "//form[@name='filter']//input[@name='sp[acc_capacity][to]']", "text");
	protected static final MyElement talkTimeMinIn = new MyElement("talkTimeMinIn", "//form[@name='filter']//input[@name='sp[talktime][from]']", "text");
	protected static final MyElement talkTimeMaxIn = new MyElement("talkTimeMaxIn", "//form[@name='filter']//input[@name='sp[talktime][to]']", "text");
	protected static final MyElement standbyMinIn = new MyElement("standbyMinIn", "//form[@name='filter']//input[@name='sp[standby][from]']", "text");
	protected static final MyElement standbyMaxIn = new MyElement("standbyMaxIn", "//form[@name='filter']//input[@name='sp[standby][to]']", "text");
	protected static final MyElement searchButton = new MyElement("searchButton", "//form[@name='filter']//input[@name='search']", "button");
	
	protected static final MyElement itemsCoast = new MyElement("itemsCoast", "//div[contains(@class,'pprice')]", "groupOfElements");
	protected static final MyElement sortByPrice = new MyElement("sortByPrice", "//a[contains(@href,'sort_by=price')]", "webElement");
	
	// Profiles
	
	protected static final LinkedHashMap<MyElement, String> minimumFilterProfile = new LinkedHashMap<MyElement, String>(){{
		put(manufacturerDmenu, "Apple");
		put(priceMinIn, "100");
		put(priceMaxIn, "400");
		put(dateOfEntryIn, "2010");
		put(mobileTypeDmenu, "телефон");
	}};
	protected static final LinkedHashMap<MyElement, String> maximumFilterProfile = new LinkedHashMap<MyElement, String>(){{
		put(manufacturerDmenu, "Apple");
		put(priceMinIn, "300");
		put(priceMaxIn, "500");
		put(dateOfEntryIn, "2013");
		put(mobileTypeDmenu, "телефон");
	}};
		
	
	
	public CatalogItemTypePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	

}
