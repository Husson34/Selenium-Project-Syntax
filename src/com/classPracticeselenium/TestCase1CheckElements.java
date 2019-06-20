package com.classPracticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1CheckElements {

	public static void main(String[] args) throws InterruptedException {
		/*1.Open chrome browser
		  2.Go to “https://www.toolsqa.com/automation-practice-form/”
		  3.Fill out:
				●First Name
				●Last Name
				●Check that sex radio buttons are enabled and select “Male”
				●Check all Years of Experience radio buttons are clickable 
				●Date
				●Select both checkboxes for profession
				●Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
				4.Quit browser*/

		System.setProperty("webdriver.chrome.driver","\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Scott");		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Brown");
		driver.findElement(By.xpath("//input[@id='sex-0']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='sex-1']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		
		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radio: radioExp) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
		driver.quit();
	}


		
		
	}


