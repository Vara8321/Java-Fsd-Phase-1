package com.ecommerce;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomateFlipkart {

	public WebDriver driver = null;
	
	@BeforeClass
	public void launchBrowser()
	{
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");
	}
	
	
		@Test(priority = 0)
		public void testPerformance() {
			
			System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "testPerformance", Thread.currentThread().getId());
			
			Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
				    "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			System.out.println("Load Time is :" + loadtime);
		}
		
		
	
		@Test(priority = 1)
		public void testFlipkartPage() throws InterruptedException {
		
		System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "testFlipkartPage", Thread.currentThread().getId());
		
		
		Thread.sleep(3000);
		
		WebElement selectPhoneCategory = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]"));
		selectPhoneCategory.click();
		
		Thread.sleep(3000);
		
		WebElement searchBar = driver.findElement(By.className("_3704LK"));
		searchBar.sendKeys("iphone 13");
		
		Thread.sleep(3000);
		
		WebElement clickSearch = driver.findElement(By.className("L0Z3Pu"));
		clickSearch.click();
		
		Thread.sleep(4000);
		
		
	}
		@Test(priority = 2)
		public void imageLoadedOrNot() {
			
			System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "imageLoadedOrNot", Thread.currentThread().getId());
			
			WebElement image1 = driver.findElement(By.className("_396cs4"));    

	        Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0", image1); 
	        if (!imageLoaded1) 
	        {
	            System.out.println("1. Image is not Loaded"); 
	        }
	        else 
	        {
	            System.out.println("Image is Loaded"); 
	        }
		}
		
		
		@Test(priority = 3)
		public void scrollBarSearch() throws Exception {
			
			System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "scrollBarSearch", Thread.currentThread().getId());
			String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
					JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
					Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
					if (test == true) {
						System.out.println("Scrollbar is present.");
					} else if (test == false){
						System.out.println("Scrollbar is not present.");
					}
				}
		
		@Test(priority = 4)
		public void scrollToBottom() throws InterruptedException {
			
			Thread.sleep(3000);
			
			System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "scrollToBottom", Thread.currentThread().getId());
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			System.out.println("Scroll Bar scrolled to bottom of the page");
			
		}
		
		@Test(priority = 5)
		public void changeResolution() throws InterruptedException {
			
			Thread.sleep(3000);
			
			System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "changeResolution", Thread.currentThread().getId());
			Dimension dimension = new Dimension(800, 600);
			driver.manage().window().setSize(dimension);
		}
		
		@AfterClass
		 public void closeBrowser() throws InterruptedException
		 {
		  Thread.sleep(5000);
		  driver.close();
		 }
}
