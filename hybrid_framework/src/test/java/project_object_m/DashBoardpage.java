package project_object_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardpage {
	
	WebDriver  driver;
	
	public DashBoardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement guru99img;
	@FindBy(xpath = "//a[@href='Managerhomepage.php']")
	WebElement  manager;
	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement newCustomer ;
	@FindBy(xpath = "//a[@href='EditCustomer.php']")
	WebElement editCustomer ;
	@FindBy(xpath = "//a[@href='DeleteCustomerInput.php']")
	WebElement deleteCustomer ;
	@FindBy(xpath = "//a[@href='addAccount.php']")
	WebElement newAccount ;
	@FindBy(xpath = "//a[@href='editAccount.php']")
	WebElement  editAcount;
	@FindBy(xpath = "//a[@href='deleteAccountInput.php']")
	WebElement deleteAccount ;
	@FindBy(xpath ="//a[@href='DepositInput.php']" )
	WebElement deposit;
	@FindBy(xpath ="//a[@href='WithdrawalInput.php']" )
	WebElement withdrawal;
	@FindBy(xpath = "//a[@href='FundTransInput.php']")
	WebElement fundTransfer;
	@FindBy(xpath = "//a[@href='PasswordInput.php']" )
	WebElement changePassword;
	@FindBy(xpath = "//a[@href='BalEnqInput.php']")
	WebElement balanceEnquiry;
	@FindBy(xpath = "//a[@href='MiniStatementInput.php']")
	WebElement miniStatement;
	@FindBy(xpath = "//a[@href='CustomisedStatementInput.php']")
	WebElement customisedStatement;
	@FindBy(xpath = "//a[@href='Logout.php']")
	WebElement logout;
	
	public void guru99img() {
		guru99img.isDisplayed();
	}
	public void manager()
	{
		manager.click();
	}
	public void newCustomer() throws InterruptedException
	{
		newCustomer.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Akshay Nidhalkar");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		//driver.findElement(By.xpath("//input[@onkeyup='validatedob();']")).click();
		driver.findElement(By.id("dob")).sendKeys("31-05-1997");
		}
	public void editCustomer()
	{
		editCustomer.click();
	}
	public void deleteCustomer()
	{
		deleteCustomer.click();
	}
	public void newAccount() {
		newAccount.click();
	}
	public void editAccount() {
		editAcount.click();
	}
	public void deleteAccount() {
		deleteAccount.click();
	}
	public void deposit() {
		deposit.click();
	}
	public void withdrawal() {
		withdrawal.click();
	}
	public void fundTransfer() {
		fundTransfer.click();
	}
	public void changePassword() {
		changePassword.click();
	}
	public void balanceEnquiry() {
		balanceEnquiry.click();
	}
	public void miniStatement() {
		miniStatement.click();
	}
	public void customisedStatement() {
		customisedStatement.click();
	}
	public void logout() {
		logout.click();
	}
	
	
	
	
	
	
	
	

}
