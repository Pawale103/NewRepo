package testcases;

import org.testng.annotations.Test;

import extentlistener.ListenersClass;

public class DashBoardTest extends ListenersClass {
	
	@Test(priority=2)
	public void searchValidation()
	{
		db.searchitem();
	}
	@Test(priority=3)
	public void addtocarValidation()
	{
		db.selectitem();
		db.addtocart();
		
	}

}
