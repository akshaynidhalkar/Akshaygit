package project_object_m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement lgnbtn;

	public void username() {
		username.sendKeys("mngr395244");
	}

	public void password() {
		password.sendKeys("YrYbEjY");
	}

	public void lgnbtn() {
		lgnbtn.click();
	}

}
