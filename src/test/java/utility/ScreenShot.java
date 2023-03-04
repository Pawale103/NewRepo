package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static String captureScreenShot(WebDriver driver,String filename) throws IOException
	{
	TakesScreenshot  srcshot=(TakesScreenshot)driver;
	
	File source=srcshot.getScreenshotAs(OutputType.FILE);
	
	//File destination=new File("");
	String path=System.getProperty("user.dir")+"\\Srcshot\\"+filename+".png";
	
	File destination= new File(path);
	
	FileUtils.copyFile(source, destination);
	

	return path ;
	}
}
