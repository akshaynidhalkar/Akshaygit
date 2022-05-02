package com.mesho.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Helper {
	WebDriver driver;

	public Helper(WebDriver driver) {
		this.driver = driver;

	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
	}

	public void screenshot() throws IOException {
		TakesScreenshot capture = (TakesScreenshot) driver;
		File srcFile = capture.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "/Screenshot/" + getCurrentTime() + ".png");
		Files.copy(srcFile, destFile);
	}

	public String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return sdf.format(currentDate);
	}

	@SuppressWarnings("deprecation")
	public void waits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
