package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "\\Users\\ScottBrown\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
WebDriver driver =new FirefoxDriver();
driver.get("https://www.google.com/");
	}

}