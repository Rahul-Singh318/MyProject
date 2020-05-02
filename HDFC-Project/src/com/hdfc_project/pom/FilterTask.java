package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterTask extends BasePage{
	
	@FindBy(xpath="//input[contains(@name,'visiableFilterString')]")
	private WebElement taskName;
	
	@FindBy(xpath="//input[@id='tasksFilterSubmitButton']")
	private WebElement ClickApplyFilter;
	
	public FilterTask(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setTaskName(String tn)
	{
		taskName.sendKeys(tn);
	}
	
	public void clickFilterTaskButton()
	{
		ClickApplyFilter.click();
	}

}
