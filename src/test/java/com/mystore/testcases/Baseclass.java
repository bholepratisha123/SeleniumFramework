package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.format.*;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	ReadConfig readConfig=new ReadConfig();
	
	String url=readConfig.getBaseUrl();
	String browser=readConfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void Setup() throws InterruptedException {
		

		
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
		
		//implicit wait of 10 s
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//For logging
		logger=LogManager.getLogger("SeleniumFramework");
		
		driver.get(url);
		driver.manage().window().maximize();
		
		logger.info("Url opened");
	}
	
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}*/
	
	//user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			
			//step2: call getScreenshotAs method to create image file
			
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
			
		}
		


}
