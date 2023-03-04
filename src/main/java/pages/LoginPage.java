package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='login']")
	WebElement signinlink;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement signinbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsigninlink()
	{
		signinlink.click();
	}
	public void enteridandpass()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		username.sendKeys("abadarkeshav@gmail.com");
		password.sendKeys("Creative123");
	}
	public void signin()
	{
		signinbutton.click();
	}

}
