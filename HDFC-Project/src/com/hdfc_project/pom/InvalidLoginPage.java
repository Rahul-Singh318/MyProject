package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class InvalidLoginPage extends BasePage{
	
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
	private WebElement errorMsg;
	
	public InvalidLoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

	public void showErrorMsg(String err)
	{
		SoftAssert soft = new SoftAssert();
		String aError = errorMsg.getText();
		soft.assertEquals(aError, err);
		soft.assertAll();
		
	}

}
