package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public IndexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}
//Identify web elements
@FindBy(name="name")
WebElement username;

@FindBy(xpath="//input[@data-qa='signup-email']")
WebElement emailId;


@FindBy(xpath="//button[normalize-space()='Signup']")
WebElement signUp;

//Already registered user
@FindBy(xpath="//input[@data-qa='login-email']")
WebElement signinEmail;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement signinPassword;

@FindBy(xpath="//button[@data-qa='login-button']")
WebElement loginButton;
//actions for registered user

public void enterSignInemail(String eml) {
	signinEmail.sendKeys(eml);
}

public void enterSignInPassword(String pwd) {
	signinPassword.sendKeys(pwd);
}

public void clickSignIn() {
	loginButton.click();
}


//identify action on webelement

public void enterUsername(String uname) {
	username.sendKeys(uname);
	
}
public void enterPassword(String pass) {
	emailId.sendKeys(pass);
	
}

public void clickOnLogin() {
	
	signUp.click();
	
}

}
