package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {

	public WebDriver driver = new FirefoxDriver();
	
	SoftAssert softAssert = new SoftAssert();
	
		@Test
		public void testGoogleSearchTextFeildContainsFlowers() {
		
		System.out.printf("Inside TESTCASE %s and thread-id is %s \n", "testGoogleSearchTextFeildContainsFlowers", Thread.currentThread().getId());

		driver.get("http://www.google.com?q=flowers");	
		
		WebElement searchTFElement = driver.findElement(By.name("q"));
		
		String searchTFText = searchTFElement.getAttribute("value");
		
		System.out.println("Search TF Text="+searchTFText);

		softAssert.assertEquals(searchTFText, "flowers"); 

	}
}
