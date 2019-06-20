package com.classPracticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTaskLogin {
	String username="standard_user";
	String password="secret_sauce";
	public static void main(String[] args) {
		// TC 1: Swag Labs Positive login:
				//Open chrome browser
				//Go to “https://www.saucedemo.com/”
				//Enter valid username and valid password and click login
				//Verify robot icon is displayed
				//Verify “Products” text is available next to the robot icon
		System.setProperty("webdriver.chrome.driver","\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[class='btn_action']")).click();
		
		boolean robot=driver.findElement(By.cssSelector("div[class='peek']")).isDisplayed();
		if(robot) {
			System.out.println("Robot is displayed after login");
		}else {
			System.out.println("robot is not displayed after login");
		}
		//verify product text
				WebElement product=driver.findElement(By.cssSelector("div.product_label"));//find element product
				boolean displayP=product.isDisplayed();// is product displayed
				String productText=product.getText();//get product text
				
				String expectedText="Products";//expected text
				if(displayP  && productText.equals(expectedText)) {//if displayed and is expected then print
					System.out.println("Element is displayed and texts is "+ productText);
				}else {
					System.out.println("Element is not displayed or text is not= "+ productText);
				}
		
		

	}

}
