package com.mesho.object.repositary;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDescription {
	WebDriver driver;
	public ProductDescription(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Add To Cart']")
	WebElement addToCart;
	
	public void addToCart() {
		WebDriverWait waits = new WebDriverWait(driver, null);
		waits.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}
