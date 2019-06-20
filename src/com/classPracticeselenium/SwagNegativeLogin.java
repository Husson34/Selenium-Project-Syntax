package com.classPracticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagNegativeLogin {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
		//go to "https://www.saucedemo.com/"
		//enter invalid username and password
		//verify error message contains:"username and password do not match any user in this service"
		
		System.setProperty("webdriver.chrome.driver","\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("scottb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		boolean error=driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
		if (error) {
			System.out.println("error message is displayed");
		}else {
			System.out.println("error message is not displayed");
			
		}
		driver.quit();
	}
	
}
