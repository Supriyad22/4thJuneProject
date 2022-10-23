package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TestBaseClass
{
   WebDriver driver;
   Logger log = Logger.getLogger("SauceDemo4thJune");
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shiva\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
		}
		
//**********************************************************//			
		
		PropertyConfigurator.configure("log4j.properties");
		
		//System.out.println("browser is opened");
		log.info("browser is opened");
		ScreenShotClass.takeScreenshot(driver);
		
		driver.manage().window().maximize();
		//System.out.println("browser is maximized");
		log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		//System.out.println("SauceDemo URL is opened");
		log.info("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screenshot
		ScreenShotClass.takeScreenshot(driver);
		
		//loginPage elements find +action perform
		LoginPOMClass x = new LoginPOMClass(driver);
		
		x.sendUserName();
		//System.out.println("username is entered");
		log.info("username is entered");
		
		x.sendPassword();
		//System.out.println("Password is entered");
		log.info("Password is entered");
		
		x.clickLoginButton();
		//System.out.println("Clicked on login button");
		log.info("Clicked on login button");
		ScreenShotClass.takeScreenshot(driver);
				
	}
	
	@AfterMethod
	public void tearDown()
	{
		   driver.quit();
	       //System.out.println("browser is closed");
	       log.info("browser is closed");
	       
	       //System.out.println("end of Program");
	       log.info("end of Program");
	}

	
}
