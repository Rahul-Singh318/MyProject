package com.hdfc_project.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutomationConstant {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", "E:/Automation Testing/Automation/chromedriver.exe");
		// open the browser
		driver = new ChromeDriver();
		
		// enter the URL
		driver.get("http://localhost/login.do");
		
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// maximise the window
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
