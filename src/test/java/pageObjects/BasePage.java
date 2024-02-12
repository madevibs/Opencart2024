package pageObjects;

import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.WebDriver;


public class BasePage {
	public WebDriver driver;
	
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
