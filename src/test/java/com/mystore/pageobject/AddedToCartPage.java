package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddedToCartPage {
	
	
	
	//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public AddedToCartPage(WebDriver rdriver)
			{
				ldriver = rdriver;
				

				PageFactory.initElements(rdriver, this);
			}
			//view cart button
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]")
			WebElement viewCart;
			//method to click on view cart
			public void clickOnViewCartButton() {
				viewCart.click();
				
			}
			

}
