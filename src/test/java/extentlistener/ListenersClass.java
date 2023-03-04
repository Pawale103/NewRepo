package extentlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Screencast;

import testcases.BaseTest;
import utility.ScreenShot;

public class ListenersClass extends BaseTest implements ITestListener {
	
	ExtentReports extent=extentReportGen.extentReportGenerator();
	
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result)
	{
		test=extent.createTest(result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, "test case got passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
		try
		{
			test.addScreenCaptureFromPath(ScreenShot.captureScreenShot(driver, result.getName()));
		}
		catch(Exception e){
			e.getMessage();
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	

	
}
