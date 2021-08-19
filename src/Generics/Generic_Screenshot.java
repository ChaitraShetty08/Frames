package Generics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshot 
{
	public static void getPic(WebDriver d) throws IOException
	{
	String photo="./Photos/";
	Date d1=new Date();
	String d2=d1.toString();
	String d3=d2.replaceAll(":", "-");
	
	TakesScreenshot ts=(TakesScreenshot) d;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photo+d3+".jpeg");
	FileUtils.copyFile(src, dst);
}
}
