package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.InvalidLoginPage;

public class VerifyInvalidLogin extends BaseTest {

	@Test
	public void VerifyInvalidLogin()
	{
		InvalidLoginPage i1 = new InvalidLoginPage(driver);
		i1.setUserName("adkjfd");
		i1.setPassword("fdsfs");
		i1.clickLoginButton();
		i1.showErrorMsg("Username or Password is invalid. Please try again.");
	}
}
