package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.PlaceOrderPage;
import com.mystore.pageobject.ProductPage;
import com.mystore.pageobject.SearchResultPage;
import com.mystore.pageobject.registeredUserAccount;
import com.mystore.pageobject.AddedToCartPage;
import com.mystore.pageobject.CheckOutPage;
import com.mystore.pageobject.CompareSearchResultText;
public class TC_BuyProduct extends Baseclass {
	@Test
	public void buyProduct() throws InterruptedException {
		
String searchkey="Sleeveless Dress";
		
		logger.info("................Search product test started................");
		IndexPage ip=new IndexPage(driver);
		IndexPage indexpage=new IndexPage(driver);
		indexpage.enterSignInemail("bholepratiksha24@gmail.com");
		logger.info("Entered registered user email");
		indexpage.enterSignInPassword("Shreeganesha@1");
		logger.info("Entered registered user password");
		indexpage.clickSignIn();
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
		
		CompareSearchResultText cpage= new CompareSearchResultText(driver);
		
		//cpage.clickArrowToAddMoreDress();
		
		cpage.clickOnAddToCartButton();
		Thread.sleep(5000);
		AddedToCartPage addcart=new AddedToCartPage(driver);
		addcart.clickOnViewCartButton();
		
		CheckOutPage proceedToCheckout=new CheckOutPage(driver);
		proceedToCheckout.clickProceedToCheckoutButton();
		
		PlaceOrderPage placeOrder=new PlaceOrderPage(driver);
		placeOrder.clickOnPlaceOrderButton();
		
	}

}
