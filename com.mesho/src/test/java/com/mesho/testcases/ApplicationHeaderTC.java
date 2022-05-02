package com.mesho.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mesho.object.repositary.AllSarees;
import com.mesho.object.repositary.ApplicationHeader;
import com.mesho.testbase.TestBase;
import com.mesho.utility.Helper;

public class ApplicationHeaderTC extends TestBase {
	@Test
	public void test1() throws IOException, InterruptedException {
		ApplicationHeader ah = new ApplicationHeader(driver);
		ah.mouseHover();
		Helper h = new Helper(driver);
		h.scroll();
		Thread.sleep(5000);
		AllSarees als = new AllSarees(driver);
		als.meesho();
		System.out.println("verified");
		h.screenshot();
		System.out.println("ok");
	}

}
