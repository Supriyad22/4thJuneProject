package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TC02VerifyLogout extends TestBaseClass 
{
	@Test
	public void verifyLogout() throws IOException
	{
		HomePOMClass hp=new HomePOMClass(driver);
		hp.clickMenuButton();
		//System.out.println("Click on menu Button");
		log.info("Click on menu Button");
		
		hp.clickLogoutButton();
		//System.out.println("Click on logout Button");
		log.info("Click on logout Button");
		ScreenShotClass.takeScreenshot(driver);
		
	   //System.out.println("apply the validation");
	   log.info("apply the validation");
	   
	   String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
	   //System.out.println("logOut functionality test case is passed");
		log.info("logOut functionality test case is passed");
	   }
	   else
	   {
	//System.out.println("logOut functionality test case is failed");
	log.info("logOut functionality test case is failed");
	   }

}
}