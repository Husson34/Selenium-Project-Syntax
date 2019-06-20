package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatefacebook {

	public static void main(String[] args) {
		//TC 1: Facebook login:
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter valid username and valid password and click login
//User successfully logged in

	System.setProperty("webdriver.chrome.driver","\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		
	}

}
