package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.HomePage;
import com.hdfc_project.pom.LoginPage;

public class VarifyHomePageTitle extends BaseTest {
	
	@Test
	public void VarifyHomeTitle() throws InterruptedException
	{
		LoginPage i1 = new LoginPage(driver);
		i1.setUserName("admin");
		i1.setPassword("manager");
		i1.checkCheckbox();
		i1.clickLoginButton();
		
		Thread.sleep(3000);
		HomePage h1 = new HomePage(driver);
		h1.CkeckTitle("actiTIME - Enter Time-Track");
	}

}
