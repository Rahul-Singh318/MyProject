package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BasePage {
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Logout(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutButton()
	{
		logout.click();
	}

}
