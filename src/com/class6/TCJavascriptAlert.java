package com.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.CommondMethods;

public class TCJavascriptAlert extends CommondMethods{

	public static void main(String[] args) throws InterruptedException {
		/*1.Open chrome browser
		 * 2.Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
		 * 3.Verify
		 * ●alert box with text “I am an alert box!” is present
		 * ●confirm box with text “Press a button!” is present
		 * ●prompt box with text “Please enter your name” is present
		 * 4.Quit browser
		 */

		CommondMethods.setUpDriver("chrome", "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();
		Alert simpAlert=driver.switchTo().alert();
		String alertText= simpAlert.getText();
		System.out.println("Alert text is--- "+simpAlert);
		simpAlert.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn')]")).click();
		Alert confAlert=driver.switchTo().alert();
		String alertText1= simpAlert.getText();
		System.out.println("Alert text is ---"+confAlert);
		confAlert.accept();
		
		//could not figure out locator for 3rd alert box
	}

}
