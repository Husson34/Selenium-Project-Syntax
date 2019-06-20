package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classTask2 {

	public static void main(String[] args) {
		/*TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”*/
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		


	}

}
