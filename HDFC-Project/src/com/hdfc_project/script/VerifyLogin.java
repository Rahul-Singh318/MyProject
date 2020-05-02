package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.InvalidLoginPage;
import com.hdfc_project.pom.LoginPage;

public class VerifyLogin extends BaseTest {
	
	@Test
	public void VerifyLogin()
	{
		LoginPage i1 = new LoginPage(driver);
		i1.setUserName("admin");
		i1.setPassword("manager");
		i1.checkCheckbox();
		i1.clickLoginButton();
	}

}
