package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		String title =driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Facebook - log in or sign up")){
			
			System.out.println("this is correct");
		}else {
			System.out.println("this is not correct");
			driver.close();
		}
	}

}
