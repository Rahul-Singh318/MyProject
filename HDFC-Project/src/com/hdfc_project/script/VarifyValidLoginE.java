package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.LoginPage;
import com.hdfc_project_generic.Excel;

public class VarifyValidLoginE extends BaseTest {
	
	@Test
	public void verifyValidLogin()
	{
		String sheet = "ValidLoginPageE";
		
		String un = Excel.getCellValue(PATH, sheet, 1, 0);
		String pw = Excel.getCellValue(PATH, sheet, 1, 1);
		String lpt = Excel.getCellValue(PATH, sheet, 1, 2);
		
		LoginPage i1 = new LoginPage(driver);
		i1.setUserName(un);
		i1.setPassword(pw);
		i1.checkCheckbox();
		i1.clickLoginButton();
		
		LoginPage l1 = new LoginPage(driver);
		l1.pageTitle(lpt);
		
	}

}
