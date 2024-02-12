package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Homepage;
import pageObjects.RegistartionPage;
import testBase.Baseclass;

public class Account_Registration extends Baseclass {
	
	@Test
	    public void registration() throws InterruptedException {
		logger.info("****starting registration****");
		//click on my account menu
		Homepage hp=new Homepage(driver);
		logger.info("****clicking on my account menu****");
		hp.ClickMyAccount();
		
		logger.info("****clicking on register****");
		hp.ClickRegister();
		   //enter all the fields
		
		logger.info("****entering all the fields****");
		
		RegistartionPage rp=new RegistartionPage(driver);
		rp.sendFirstName(randomeString());   
		rp.sendLastName(randomeString());
		rp.sendEmail(randomeString()+"@gmail.com");
		rp.sendPasword(randomAlphaNumeric());
		Thread.sleep(2000);
		rp.selectAgree();
		Thread.sleep(2000);
		rp.ClickContinue();
		String act_text=rp.teXtVerify();  // the actual text
		Assert.assertEquals(act_text, "Your Account Has Been Created!"  ,"registration is not succesfull");
	      logger.info("***accountRegistartion is completed*****");	
	    }
	
	

}
