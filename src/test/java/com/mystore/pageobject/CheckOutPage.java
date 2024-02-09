package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public CheckOutPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}
	
	//proceed to checkout button
	@FindBy(xpath="//a[contains(@class, 'btn') and contains(@class, 'btn-default') and contains(@class, 'check_out') and text()='Proceed To Checkout']")
	WebElement proceedtoCheckoutButton;
	
	//Click method to be performed on proceedtoceckoutbutton
	public void clickProceedToCheckoutButton() {
		proceedtoCheckoutButton.click();
	}

}
