package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreationDetails;
import com.mystore.pageobject.ContinueButton;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.registeredUserAccount;



public class TC_MyAccountPageTest extends Baseclass{
	
	@Test(enabled=false)
	public void verifyRegistationAndLogin() throws InterruptedException {
		
		
		IndexPage ip=new IndexPage(driver);
		ip.enterUsername("Pratiksha Bhole");
		logger.info("Username entered");
		ip.enterPassword("bholepratiksha24@gmail.com");
		logger.info("EmailID entered");
		Thread.sleep(3000);
		ip.clickOnLogin();
		logger.info("Clicked on SignUp");
		Thread.sleep(3000);
		
		
		AccountCreationDetails accCreationPg= new AccountCreationDetails(driver);
		logger.info("Account creation started");
		accCreationPg.selectTitle();
		logger.info("Title entered");
		accCreationPg.enterPassword("Shreeganesha@1");
		logger.info("Password entered");
		accCreationPg.enterFirstName("Pratiksha");
		logger.info("FirstName entered");
		accCreationPg.enterLastName("Bhole");
		logger.info("LastName entered");
		accCreationPg.enterAddress1("House number 190, kalbadevi Ratnagiri");
		logger.info("Adress entered");
		accCreationPg.enterStateName("Maharashtra");
		logger.info("state entered");
		accCreationPg.enterCity("Ratnagiri");
		logger.info("City entered");
		accCreationPg.enterZipcode("41612");
		logger.info("Zipcode entered");
		accCreationPg.enterMobileNumber("7030984696");
		logger.info("Mobile Number entered");
		accCreationPg.clickCreateAccountButton();
		logger.info("Create account button clicked entered");
		logger.info("Account successfully created entered");
		//create object of ContinueButton class
		ContinueButton btn1=new ContinueButton(driver);
		btn1.clickOnContinueButton();
		Thread.sleep(5000);
		logger.info("Clicked on continue button");
		//registeredUserAccount ruser=new registeredUserAccount(driver);
		//ruser.clickOnLogoutButton();
		//Thread.sleep(5000);
		
		
		/*//create object of registeredUsrAccount class
		registeredUserAccount ruser=new registeredUserAccount(driver);
		String rgUserName=ruser.getUserName();
		
		//verify user name value actual and expected
		Assert.assertEquals(rgUserName, "Logged in as Pratiksha Bhole");
		logger.info("User Verified");*/
		
	}
	@Test(priority=2)
	public void verifyLogin() throws IOException, InterruptedException {
		
		IndexPage indexpage=new IndexPage(driver);
		indexpage.enterSignInemail("bholepratiksha24@gmail.com");
		logger.info("Entered registered user email");
		indexpage.enterSignInPassword("Shreeganesha@1");
		logger.info("Entered registered user password");
		
		indexpage.clickSignIn();
		
		logger.info("Clicked on signin button");
		
		
		//create object of registeredUsrAccount class
		registeredUserAccount ruser=new registeredUserAccount(driver);
		
		ruser.clickProductTab();
		//sString rgUserName=ruser.getUserName();
		
		
		logger.info("Clicked on Products tab");
		
		//verify user name value actual and expected
		
		
		/*if(rgUserName.equals("Logged in as Pratiksha Bhole")) {
			logger.info("verify login passed");
			
			Assert.assertTrue(true);
		}else {
			logger.info("verify login failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);*/
			
		
		
		
	}
	
	

}
