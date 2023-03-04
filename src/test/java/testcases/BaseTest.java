package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.LoginPage;
import utility.ReadDataFromProp;

public class BaseTest {
	public static WebDriver driver;
	
	public LoginPage lp;
	public DashBoard db;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver","\"C:\\Users\\91738\\Documents\\chromedriver.exe\"");
	    WebDriverManager.chromedriver().setup();
	   // driver=new ChromeDriver();
	    
	    //driver.manage().window().maximize();
	    
	    ChromeOptions options= new ChromeOptions();
	    
	    options.addArguments("--start-maximized");
	    //options.addArguments("--incognito");
	    
	    driver=new ChromeDriver(options);
	    String value=ReadDataFromProp.readDatafromProperties("testsiteUrl");
	    
	    driver.get(value);
	}
	
	@BeforeClass
	public void createObject()
	{
		lp=new LoginPage(driver);
		db= new DashBoard(driver);
	}


	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
	
	
		

}
