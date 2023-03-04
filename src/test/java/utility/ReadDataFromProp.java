package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProp {
	
	public static Properties prop;
	
	public static String readDatafromProperties(String key) throws IOException	
	{
		prop=new Properties();
		String filepath=System.getProperty("user.dir")+"\\config.properties";
		FileInputStream fis= new FileInputStream(filepath);
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}

}
