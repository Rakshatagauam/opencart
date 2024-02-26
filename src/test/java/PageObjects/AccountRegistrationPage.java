package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	ChromeDriver driver;
	
	public AccountRegistrationPage(ChromeDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkdPolicy;

	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setfirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);

}

public void setPrivacyPolicy() {
	chkdPolicy.click();

}


public void clickcontinue()
{
	btnContinue.click();
}
public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

}

}
