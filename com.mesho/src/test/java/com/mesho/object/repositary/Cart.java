package com.mesho.object.repositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	WebDriver driver;
	public Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Continue']")
	WebElement Continue;
	public void Continue() {
		Continue.click();
	}
	
	

}
