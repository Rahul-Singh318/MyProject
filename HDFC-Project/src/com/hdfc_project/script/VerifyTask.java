package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.LoginPage;
import com.hdfc_project.pom.Tasks;

public class VerifyTask extends BaseTest{
	
	@Test
	public void VerifyClickOnTask()
	{
		LoginPage i1 = new LoginPage(driver);
		i1.setUserName("admin");
		i1.setPassword("manager");
		i1.checkCheckbox();
		i1.clickLoginButton();
		
		Tasks t1 = new Tasks(driver);
		t1.clickOnTask();
	}

}
