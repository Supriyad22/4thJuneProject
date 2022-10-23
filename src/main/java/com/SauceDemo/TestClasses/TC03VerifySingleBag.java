package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TC03VerifySingleBag extends TestBaseClass
{
	@Test
public void verifySingleBag() throws InterruptedException, IOException
{
    HomePOMClass hp=new HomePOMClass(driver);
	
	hp.clickBagButton();
	//System.out.println("Click single bagproduct");
	log.info("Click single bagproduct");
	ScreenShotClass.takeScreenshot(driver);
	Thread.sleep(3000);
//**************************************************************//	
	String exceptedProduct = "1";
	
	String actualProduct = hp.getTextFromAddToCart();
	//System.out.println("actual product->"+actualProduct);
	log.info("actual product->"+actualProduct);
	
	//System.out.println("apply validation");
	log.info("apply validation");
	
	if(exceptedProduct.equals(actualProduct))
	{
	//System.out.println("Bag product add to cart case is passed");
   log.info("Bag product add to cart case is passed");
	}
	else
	{
	//System.out.println("Bag product add to cart case is failed");
	log.info("Bag product add to cart case is failed");
	}
//*****************************************************************//	

}
}