package com.mesho.object.repositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;

	@FindBy(xpath = "//span[text()='Download App']")
	WebElement downloadApp;

	@FindBy(xpath = "//span[text()='Become a Supplier']")
	WebElement becomeASuppulier;

	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profile;

	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;
}
