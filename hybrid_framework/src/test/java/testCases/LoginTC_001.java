package testCases;

import org.testng.annotations.Test;

import project_object_m.DashBoardpage;
import project_object_m.LoginPage;
import testBase.TestBase;

public class LoginTC_001 extends TestBase {
	
	@Test
	public void verifyLoginFunctionality() throws InterruptedException
	{
//		LoginPage lp=new LoginPage(driver);
//		lp.username();
//		lp.password();
//		lp.lgnbtn();
		DashBoardpage db= new DashBoardpage(driver);
		db.newCustomer();
	}

}
