package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registeredUserAccount {
	
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public registeredUserAccount(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}
	
	//find web elements
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/h2[1]")
	WebElement registeredUser;
	
	@FindBy(xpath ="//a[@href='/logout']")
	WebElement logoutButton;
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productsTab;
	
	public String getUserName() {
		String uname=registeredUser.getText();
		return uname;
	}
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
	
	public void clickProductTab() {
		productsTab.click();
	}
	

}
