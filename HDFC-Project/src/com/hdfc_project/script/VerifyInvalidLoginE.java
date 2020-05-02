package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.InvalidLoginPage;
import com.hdfc_project_generic.Excel;

public class VerifyInvalidLoginE extends BaseTest {
	
	@Test
	public void verifyInvalidLogin() throws InterruptedException
	{
		String sheet="InValidLoginPageE";
		
	 int rc = Excel.getRowCount(PATH, sheet);
	 
	 for(int i=1;i<=rc;i++)
	 {
	 String un = Excel.getCellValue(PATH, sheet, i,0);
	 String pw = Excel.getCellValue(PATH, sheet, i, 1);
//	 String errMsg = Excel.getCellValue(PATH, sheet, i, 2);
	 
	
	 Thread.sleep(3000);
	 
	 InvalidLoginPage i1 = new InvalidLoginPage(driver);
		i1.setUserName(un);
		i1.setPassword(pw);
		i1.clickLoginButton();
//		i1.showErrorMsg(errMsg);
	        }
	 }

}
