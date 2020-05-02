package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chkbox;
	
	public LoginPage(WebDriver driver)
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
	
	public void checkCheckbox()
	{
		chkbox.click();
		boolean selected = chkbox.isSelected();
		Assert.assertTrue(selected);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

}
