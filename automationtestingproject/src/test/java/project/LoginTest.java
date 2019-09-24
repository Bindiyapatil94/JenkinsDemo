package project;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ExtentITestListenerAdapter;


@Listeners({ExtentITestListenerAdapter.class})
public class LoginTest extends BaseTest{
	@Test
	public void validate_login_test()
	{
		page.getInstance(LoginPage.class).doLogin();
		
	}
	

}
