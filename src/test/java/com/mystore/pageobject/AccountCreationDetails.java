package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationDetails {
	
		//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public AccountCreationDetails(WebDriver rdriver)
		{
			ldriver = rdriver;
			

			PageFactory.initElements(rdriver, this);
		}
		
		//find web elements
		@FindBy(id="id_gender1")
		WebElement title;

		@FindBy(id="password")
		WebElement password;

		@FindBy(id="first_name")
		WebElement firstName;
		
		@FindBy(id="last_name")
		WebElement lastName;
		
		@FindBy(id="address1")
		WebElement address1;
		
		@FindBy(id="state")
		WebElement stateName;
		
		@FindBy(id="city")
		WebElement cityName;
		
		@FindBy(id="zipcode")
		WebElement zipCode;
		
		@FindBy(xpath="//input[@id='mobile_number']")
		WebElement mobileNumber;
		
		@FindBy(xpath="//button[normalize-space()='Create Account']")
		WebElement createAccountButton;
		
		//Identify action to be performed
		
		public void selectTitle() {
			title.click();
			
		}
		
		public void enterPassword(String pass) {
			password.sendKeys(pass);
			
		}
		
		public void enterFirstName(String fname) {
			
			firstName.sendKeys(fname);
		}
		
		public void enterLastName(String lname) {
			
			lastName.sendKeys(lname);
		}
		
		public void enterAddress1(String address) {
			address1.sendKeys(address);
			
		}
		
		public void enterStateName(String state) {
			stateName.sendKeys(state);
			
		}
		
		public void enterCity(String city) {
			cityName.sendKeys(city);
			
		}
		
		public void enterZipcode(String code) {
			zipCode.sendKeys(code);
			
		}
		public void enterMobileNumber(String number) {
			mobileNumber.sendKeys(number);
			
		}
		
		public void clickCreateAccountButton() {
			createAccountButton.click();
			
		}
		

}

