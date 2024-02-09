package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public ProductPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/input[1]")
		WebElement searchBox;
		
		@FindBy(xpath="//button[@id='submit_search']")
		WebElement submitSearchbutton;
		
		public void enterDataInSearchBox(String productName) {
			
			searchBox.sendKeys(productName);
		}
		
		public void clickOnsearchButton() {
			submitSearchbutton.click();
		}

}
