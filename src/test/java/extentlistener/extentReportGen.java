package extentlistener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportGen {
	
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		String path =System.getProperty("user.dir")+"//reports//Mystore.html";
		
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(path);
		
		reporter.config().setReportName("MYStoreTestReport");
		
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Browser name", "Chrome");
		
		extent.setSystemInfo("server", "stage");
		
		extent.setSystemInfo("Os", "Windows");
			
		return extent;
	}

}
