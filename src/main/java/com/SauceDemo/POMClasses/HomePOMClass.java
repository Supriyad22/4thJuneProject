package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
//**1.Declaring Variables
	 private WebDriver driver;
	 private Select s;
	 
//*********************************************************************//
//**2.Element @FindBy Annotation
 
  //**BagProduct single element selected
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;
		
 //**create method
  public void clickBagButton()
  {
  bagButton.click();	
  }	 

//*******************************************************************//
  //**3.MultipleProduct Selected
   @FindBy(xpath="//button[text()='Add to cart']")
   
   private List<WebElement>allProducts;

  //**create method
public void clickallProducts()
{
for(int i=0;i<allProducts.size();i++) //**Use for each loop
{
	allProducts.get(i).click();
}
}
//***************************************************************//
//**4.Add To cart elements
@FindBy(xpath="//a[@class='shopping_cart_link']")

private WebElement addToCart;

//**create method
	public String getTextFromAddToCart()
	{
		String totalProducts = addToCart.getText();
		return totalProducts;
	}

//******************************************************************//
//**Dropdown on filter Element
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDown;
	
	//**create a method
	public void clickOnDropDownFilter()
	{
		dropDown.click();	
		
		//Select s = new Select(dropDown);
		
		s.selectByValue("lohi");
	}
//**************************************************************//
//**find menuButton Element by using Annotation
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement menuButton;
		
		//**3.create a method
		public void clickMenuButton()
		{
		menuButton.click();	
		}
//***************************************************************//
//**find logoutbutton element by using find annotation
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement logoutButton;
		
		//**5.create method
		public void clickLogoutButton() 
		{
			logoutButton.click();
		}


//************************************************************//
	//**5.creating constructer
		public HomePOMClass (WebDriver driver)
		{
		  //global        local
			this.driver = driver;
			
			//**Selenium Class->static method
			PageFactory.initElements(driver,this);
			
		//Global
			s = new Select(dropDown);
		}

//***************************************************************//
}
