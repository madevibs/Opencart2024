package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import testBase.Baseclass;

public class Login_Testcase extends Baseclass{
	@Test
	public void login() {
		
		Homepage hp=new Homepage(driver);
		hp.ClickMyAccount();
		hp.clickLogin();
		
		
		
		LoginPage lp=new LoginPage(driver);
		lp.sendEmail(rb.getString("email"));
		lp.sendPassword(rb.getString("password"));
		lp.clickOnLogin();
		
		
		
		
	}
	
	

}
