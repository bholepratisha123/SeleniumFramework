package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public PlaceOrderPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}
		
		//Find place order button
		@FindBy(xpath="//a[@href='/payment' and contains(@class, 'btn') and contains(@class, 'btn-default') and contains(@class, 'check_out') and text()='Place Order']")
		WebElement placeOrderButton;
		
		//click method to perform on placeorderbutton
		public void clickOnPlaceOrderButton() {
			
			placeOrderButton.click();
		}
		

}
