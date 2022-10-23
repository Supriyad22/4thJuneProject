package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TC01VerifyLogin extends TestBaseClass 
{
	@Test
public void verifyLogin() throws IOException
{
	ScreenShotClass.takeScreenshot(driver);
   	//System.out.println("Apply validation on HomePage");
   	log.info("Apply validation on HomePage");
   	
   	String expectedTitle = "Swag Labs";//given by BA
   	
   	String actualTitle = driver.getTitle();
   	
   	System.out.println("GetTitle-->"+actualTitle );
   	
   	if(expectedTitle.equals(actualTitle))
   	{
   	//System.out.println("Login functionality testcase is passed");
   	log.info("Login functionality testcase is passed");
   	}
   	else
   	{
   		//System.out.println("Login functionality testcase is failed");
   	log.info("Login functionality testcase is failed");
   	}
}
}
