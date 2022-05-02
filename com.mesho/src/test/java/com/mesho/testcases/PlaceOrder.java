package com.mesho.testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import com.mesho.object.repositary.AllSarees;
import com.mesho.object.repositary.ApplicationHeader;
import com.mesho.object.repositary.Cart;
import com.mesho.object.repositary.ProductDescription;
import com.mesho.testbase.TestBase;
import com.mesho.utility.Helper;

public class PlaceOrder extends TestBase {
	@Test
	public void test2() throws InterruptedException, IOException {
		ApplicationHeader ah = new ApplicationHeader(driver);
		Helper h = new Helper(driver);
		AllSarees as = new AllSarees(driver);
		ProductDescription pd = new ProductDescription(driver);
		Cart ct = new Cart(driver);
		ah.mouseHover();
		as.abhisarikaGS();
		pd.addToCart();
		ct.Continue();
		h.screenshot();
		System.out.println("ok");
	}
}
