package testCases;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.Homepage;
import testBase.Baseclass;

public class TC_001_AccountRegistrationTest extends Baseclass {

	
	
	@Test
	public void verify_account_Registration()
	{
		Homepage hp= new Homepage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setfirstname(randomeString().toUpperCase());
		regpage.setlastname(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		
		
		regpage.setPrivacyPolicy();
		regpage.clickcontinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}

	
}
