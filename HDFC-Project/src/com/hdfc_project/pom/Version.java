package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Version extends BasePage {
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME 2015.1')]")
	private WebElement version;
	
	public Version(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void appVersion(String ver)
	{
		String aver = version.getText();
		Assert.assertEquals(aver, ver);
	}
	
	

}
