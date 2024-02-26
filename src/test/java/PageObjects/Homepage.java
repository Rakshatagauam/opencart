package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
	ChromeDriver driver;
	
	public  Homepage(ChromeDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;
	
	public void clickmyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickregister()
	{
		lnkRegister.click();
	}
	

}
