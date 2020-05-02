package com.hdfc_project.script;

import org.testng.annotations.Test;

import com.hdfc_project.pom.Version;

public class VerifyVersion extends BaseTest {
	
	@Test
	public void verifyVersion()
	{
		Version v1 = new Version(driver);
		v1.appVersion("actiTIME 2015.1");
	}

}
