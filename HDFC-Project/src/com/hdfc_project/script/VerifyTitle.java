package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.LoginPage;

public class VerifyTitle extends BaseTest {

	
	@Test
	public void verifyLoginPageTitle()
	{
		LoginPage l1 = new LoginPage(driver);
		l1.pageTitle("actiTIME - Login");
		
	}
}
