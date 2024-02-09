package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.CompareSearchResultText;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.registeredUserAccount;
import com.mystore.pageobject.ProductPage;
import com.mystore.pageobject.SearchResultPage;

public class TC_ProductPageTest extends Baseclass {
	@Test(priority=1)
	public void enterSearchproduct() throws IOException, InterruptedException {
		
		String searchkey="Sleeveless Dress";
		
		logger.info("................Search product test started................");
		IndexPage ip=new IndexPage(driver);
		
		ip.enterSignInemail("bholepratiksha24@gmail.com");
		logger.info("Entered registered user email");
		ip.enterSignInPassword("Shreeganesha@1");
		logger.info("Entered registered user password");
		ip.clickSignIn();
		logger.info("Clicked on signin button");
		
		registeredUserAccount ruser=new registeredUserAccount(driver);
		ruser.clickProductTab();
		Thread.sleep(5000);
		
		logger.info("Clicked product page");
		
		
		
		ProductPage productpage=new ProductPage(driver);
		
		productpage.enterDataInSearchBox(searchkey);
		
		logger.info("entered data in the seach box");
		productpage.clickOnsearchButton();
		logger.info("Clicked search button");
		
		
		//click on the view button
		SearchResultPage spage=new SearchResultPage(driver);
		spage.clickActionOnViewButton();
		logger.info("Clicked view button of the product");
		
		//Compare text of the search product
		CompareSearchResultText cpage=new CompareSearchResultText(driver);
		String searchResultProductName=cpage.getSearchResultText();
		
		if(searchResultProductName.contains(searchkey)) {
			
			logger.info("search result text comparison passed");
			Assert.assertTrue(true);
		}else {
			
			logger.info("search result text comparison failed");
			captureScreenShot(driver, "enterSearchproduct");
			Assert.assertTrue(false);
			
		}
	
		
		
		
		
		
	}
	@Test(enabled=false)
	public void verifyLogin() throws InterruptedException, IOException {
		
		
			logger.info("..........................verifylogin started..................................");
			IndexPage ip=new IndexPage(driver);
			Thread.sleep(5000);
			ip.enterSignInemail("bholepratiksha24@gmail.com");
			Thread.sleep(5000);
			
			logger.info("Entered registered user email");
			ip.enterSignInPassword("Shreeganesha@1");
			Thread.sleep(5000);
			logger.info("Entered registered user password");
			//Thread.sleep(3000);
			ip.clickSignIn();
			logger.info("Clicked on signin button");
			
			
			//create object of registeredUsrAccount class
			registeredUserAccount ruser=new registeredUserAccount(driver);
			String rgUserName=ruser.getUserName();
			ruser.clickProductTab();
			
			logger.info("Clicked on Products tab");
			//ruser.clickOnLogoutButton();
			//ruser.clickOnLogoutButton();
			//logger.info("Clicked on logout button");
			//verify user name value actual and expected
			
			
			if(rgUserName.equals("Logged in as Pratiksha Bhole")) {
				logger.info("verify login passed");
				
				Assert.assertTrue(true);
			}else {
				logger.info("verify login failed");
				captureScreenShot(driver, "verifyLogin");
				Assert.assertTrue(false);
				
			}
	
		
		
	
	}
	

}
