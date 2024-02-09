package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueButton {
	
	//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public ContinueButton(WebDriver rdriver)
			{
				ldriver = rdriver;
				

				PageFactory.initElements(rdriver, this);
			}
			//find web elements
			@FindBy(xpath="//a[normalize-space()='Continue']")
			WebElement continueButton1;
			
			//actions
			public void clickOnContinueButton() {
				continueButton1.click();
			}

}
