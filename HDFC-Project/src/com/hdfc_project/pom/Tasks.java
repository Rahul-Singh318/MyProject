package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage{
	
	@FindBy(xpath="//div[contains(text(),'Tasks')]")
	private WebElement task;
	
	public Tasks(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTask()
	{
		task.click();
	}

}
