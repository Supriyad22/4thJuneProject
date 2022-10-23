package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
 private WebDriver driver;
 private Actions act;

 //*****************************************************// 
 @FindBy(xpath="//input[@id='user-name']")
 private WebElement userName;
 
 public void sendUserName() 
 {
	 userName.sendKeys("standard_user");
 }
	 
 @FindBy(xpath="//input[@id='password']")
 private WebElement password;

 public void sendPassword()
 {
 	password.sendKeys("secret_sauce");	
 }
 
 @FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;

 //*****Perform By Mouse Action*****//
 
 public void clickLoginButton()
 {
//	 Actions act =new Actions(driver);
//	 act.click(loginButton).perform();

	 act.click(loginButton).perform();
 }
 
//public void clickLoginButton()
//{
//	loginButton.click();
//}

//***********************************************************//
public LoginPOMClass(WebDriver driver)
{
	//Global      local
	this.driver = driver;
	
//Selenium Class(pagefactory)->static method(initElement)
	PageFactory.initElements(driver,this);
	
	act =new Actions(driver);
}
 
}
