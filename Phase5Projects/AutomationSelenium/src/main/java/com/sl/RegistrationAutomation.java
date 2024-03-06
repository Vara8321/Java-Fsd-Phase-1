package com.sl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationAutomation {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		faceBookAcctCreation();


		Thread.sleep(30000);
		driver.close(); // close the automated browser
	}

	public static void faceBookAcctCreation() throws InterruptedException {

		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);

		WebElement firstNameElement = driver.findElement(By.name("firstname"));
		firstNameElement.sendKeys("Akula");
		
		Thread.sleep(3000);
		
		WebElement lastNameElement = driver.findElement(By.name("lastname"));
		lastNameElement.sendKeys("Niharika");
		
		Thread.sleep(3000);
		
		WebElement phoneNumberElement = driver.findElement(By.name("reg_email__"));
		phoneNumberElement.sendKeys("9381551782");
		
		Thread.sleep(3000);
		
		WebElement passwordElement = driver.findElement(By.name("reg_passwd__"));
		passwordElement.sendKeys("Niha@1234");
		
		Thread.sleep(3000);
		
		WebElement dayElement = driver.findElement(By.id("day"));
		Select select1 = new Select(dayElement);
		select1.selectByVisibleText("1");
		
		Thread.sleep(3000);
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select select2 = new Select(monthElement);
		select2.selectByVisibleText("Jun");
		
		Thread.sleep(3000);
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select select3 = new Select(yearElement);
		select3.selectByVisibleText("2000");
		
		Thread.sleep(3000);
		
		WebElement gender =  driver.findElement(By.cssSelector("input[type='radio'][value='1']")); 
		gender.click(); 
		
		
		System.out.println("Successfully located Gender radio feild and set it to value Female");
		
		Thread.sleep(3000);
		
		//WebElement nextButton = driver.findElement(By.name("websubmit"));
		//nextButton.click();
		
				
	}
}
