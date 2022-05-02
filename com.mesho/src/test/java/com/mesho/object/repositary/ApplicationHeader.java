package com.mesho.object.repositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	WebDriver driver;
	public ApplicationHeader(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Women Ethnic']")
	WebElement womenEthinic;
	
	@FindBy(xpath = "//p[text()='All Sarees']")
	WebElement allSarees;
	
	@FindBy(xpath = "//span[text()='Women Western']")
	WebElement  womenWestern;
	
	@FindBy(xpath = "//span[text()='Jewellery & Accessories']")
	WebElement  jewelleryAccerssories;
	
	@FindBy(xpath = "//span[text()='Men']")
	WebElement  men;
	
	@FindBy(xpath = "//span[text()='Beauty & Health']")
	WebElement  beautyHealth;
	
	@FindBy(xpath = "//span[text()='//span[text()='Bags & Footwear']']")
	WebElement  bagsFootware;
	
	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	WebElement  homeKitchen;
	
	@FindBy(xpath = "//span[text()='Kids']")
	WebElement  kids;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	WebElement  electronics;
	
	public void mouseHover()
	{
		Actions action = new Actions(driver);
		action.moveToElement(womenEthinic).moveToElement(allSarees)
		.click().build().perform();
	}
	
	
	
	
	
	
	
	
	

}
