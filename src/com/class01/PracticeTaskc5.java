package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTaskc5 {

	public static void main(String[] args) {
		// TC 1: Swag Labs Positive login:
		//Open chrome browser
		//Go to “https://www.saucedemo.com/”
		//Enter valid username and valid password and click login
		//Verify robot icon is displayed
		//Verify “Products” text is available next to the robot icon

		System.setProperty("webdriver.chrome.driver", "\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open chrome browser, go to saucedemo website
		driver.get("https://www.saucedemo.com/");
		// login to application
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//logo verification
		
		boolean logo=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		if (logo) {
			System.out.println("the logo is displayed");
	
		}else {
			System.out.println("the logo is not displayed");	
		}
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		if(displayP  && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+ productText);
		}else {
			System.out.println("Element is not displayed or text is not= "+ productText);
		}
		driver.quit();
	}

}
