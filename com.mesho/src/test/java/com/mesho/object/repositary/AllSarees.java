package com.mesho.object.repositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllSarees {
	WebDriver driver;
	public AllSarees(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@class='header-logo-container']")
	WebElement meesho;
	
	@FindBy(xpath = "//p[text()='Aakarsha Graceful Sarees']")
	WebElement aakarshaGS;
	
	@FindBy(xpath = "//p[text()='Aishani Ensemble Sarees']")
	WebElement aishaniES;
	
	@FindBy(xpath = "//p[text()='Abhisarika Graceful Sarees']")
	WebElement abhisarikaGS;
	
	
	@FindBy(xpath = "//p[text()='Aakarsha Ensemble Sarees']")
	WebElement aakarshaES;
	
	public void abhisarikaGS() {
		abhisarikaGS.click();
		
	}
	public void meesho() {
		meesho.click();
	}



}	




