package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public SearchResultPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
		WebElement viewProdutButton;
		
		public void clickActionOnViewButton() {
			viewProdutButton.click();
			
		}

}
