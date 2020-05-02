package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.LoginPage;
import com.hdfc_project.pom.Logout;

public class VarifyLogout extends BaseTest {
	
	@Test
	public void VarifyLogoutButton()
	{
		LoginPage i1 = new LoginPage(driver);
		i1.setUserName("admin");
		i1.setPassword("manager");
		i1.checkCheckbox();
		i1.clickLoginButton();
		
		Logout l1 = new Logout(driver);
		l1.clickLogoutButton();
	}

}
