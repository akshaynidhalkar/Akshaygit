package project_object_m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

	WebDriver driver;

	public ApplicationHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")
	WebElement selenium;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/insurance/v1/index.php']")
	WebElement insuaranceProject;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/Agile_Project/Agi_V1/']")
	WebElement agileProject;
	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")
	WebElement bankProject;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']")
	WebElement securityProject;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/telecom/index.html']")
	WebElement telecomProject;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/payment-gateway/index.php']")
	WebElement paymentGateawayProject;
	@FindBy(xpath = "//a[@href='http://demo.guru99.com/test/newtours/']")
	WebElement newTours;
	@FindBy(xpath = "//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")
	WebElement seo;

	public void selenium() {
		selenium.click();
	}

	public void insuaranceProject() {
		insuaranceProject.click();
	}

	public void agileProject() {
		agileProject.click();
	}

	public void bankProject() {
		bankProject.click();
	}

	public void securityProject() {
		securityProject.click();
	}

	public void telecomProject() {
		telecomProject.click();
	}

	public void paymentGateawayProject() {
		paymentGateawayProject.click();
	}

	public void newTours() {
		newTours.click();
	}

	public void seo() {
		seo.click();
	}

}
