package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TC04VerifyAllProduct extends TestBaseClass 
{
	@Test
public void verifyallProduct() throws InterruptedException, IOException 
{
		HomePOMClass hp=new HomePOMClass(driver);
		
		hp.clickallProducts();
		//System.out.println("Clicked on all Products");
		log.info("Clicked on all Products");
		ScreenShotClass.takeScreenshot(driver);
		Thread.sleep(3000);
		
		{
			//System.out.println("apply the validation");
			log.info("apply the validation");
			
			String expectedProduct = "6";
			
			String actualProduct = hp.getTextFromAddToCart();
			//System.out.println("actual product->"+actualProduct);
			log.info("actual product->"+actualProduct);
			
			//System.out.println("apply validation");
			log.info("apply validation");
			
			Assert.assertEquals(actualProduct, expectedProduct);

		}
		
}
}
