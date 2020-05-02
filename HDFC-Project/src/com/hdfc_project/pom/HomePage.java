package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//a[contains(@class,'item active')]")
	private WebElement HomePageTitle;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void CkeckTitle(String etitle)
	{
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle, etitle);
		
	}

}
