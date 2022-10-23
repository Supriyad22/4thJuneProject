package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1= new SimpleDateFormat("MM-dd-yy &HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File seleFile1 = ts1.getScreenshotAs(OutputType.FILE);
		File myFile1= new File("D:\\ScreenShot Folderr\"ScreenShots\\SauceDemo"+date+".jpg");
		FileHandler.copy(seleFile1, myFile1);
}
}