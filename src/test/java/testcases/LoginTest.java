package testcases;

import org.testng.annotations.Test;

import extentlistener.ListenersClass;

public class LoginTest extends ListenersClass {
	
	
	@Test(priority=1)
	public void verifyLogin()
	{
		lp.clickonsigninlink();
		test.info("Entering credentials");
		lp.enteridandpass();
		lp.signin();
		test.info("Login Successful");
		
	}

}
