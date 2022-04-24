package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver = null;

	@BeforeTest
	@Parameters({ "browser", "url" })
	public void setUp(@Optional("Chrome") String brName,
			@Optional("https://demo.guru99.com/V4/index.php") String url) {
		if (brName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser does not match");
		}

		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
