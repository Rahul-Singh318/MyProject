package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class BasePage {
	
	public static WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void pageTitle(String eTitle)
	{
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle, eTitle);
	}

}
