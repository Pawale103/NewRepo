package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoard {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='search_query']")
	WebElement searchbox;
	
	@FindBy(xpath="submit_search")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
	WebElement dresstype;
	
	@FindBy(xpath="//select[@name='group_1']")
	WebElement size;
	
	@FindBy(xpath="//*[@class='btn btn-default button-plus product_quantity_up']")
	WebElement addquantity;
	
	@FindBy(xpath="//*[@name='Black']")
	WebElement colour;
	
	@FindBy(xpath="//*[@id='add_to_cart']")
	WebElement addtocartbutton;
	
	public DashBoard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchitem()
	{
		searchbox.sendKeys("casual dresses");
		searchbutton.click();
	}
	public void selectitem()
	{
		dresstype.click();
	}
	public void addtocart()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		addquantity.click();
		addquantity.click();
		colour.click();
		
		Select sel= new Select(size);
		sel.deselectByVisibleText("M");
		addtocartbutton.click();
	}

}
