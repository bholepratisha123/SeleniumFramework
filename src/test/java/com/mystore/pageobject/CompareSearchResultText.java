package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareSearchResultText {
	
	//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public CompareSearchResultText(WebDriver rdriver)
			{
				ldriver = rdriver;
				

				PageFactory.initElements(rdriver, this);
			}
			//find Search result text 
			@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/h2[1]")
			WebElement CompareSearchResultText;
			//click on add to cart button
			@FindBy(xpath="//button[@type='button' and contains(@class, 'btn-default') and contains(@class, 'cart') and i[contains(@class, 'fa-shopping-cart')]]\r\n"
					+ "")

					WebElement addToCartButton;
			//to increase the quantity of the dress
			@FindBy(xpath="//input[@type='number' and @name='quantity' and @id='quantity' and @value='1' and @min='1']")
			WebElement arrowButtonUp;
		//to get the text of the search product
			public String getSearchResultText() {
				String searchTxt=CompareSearchResultText.getText();
				return searchTxt;
			}
			//method to perform click action on arrow button
			public void clickArrowToAddMoreDress() {
				arrowButtonUp.click();
				
			}
			//to click on add to cart button
			public void clickOnAddToCartButton() {
				addToCartButton.click();
			}

}
