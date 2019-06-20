package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommondMethods;

public class FrameVerification extends CommondMethods{

	public static void main(String[] args) {
		/*1.Open chrome browser
		 * 2.Go to “https://the-internet.herokuapp.com/”
		 * 3.Click on “ Guest Blogs” link inside first frame
		 * 4.Verify element “Interactions” is present in second frame
		 * 5.Navigate to Home Page
		 * 6.Quit browser
		 */
		CommondMethods.setUpDriver("chrome", "http://hugelearning.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		//driver.findElement(By.xpath("//input[@name='First_Name']")).click();
		driver.findElement(By.xpath("//input[@name='First_Name']")).sendKeys("Jason");
		driver.findElement(By.xpath("//input[@name='Last_Name']")).sendKeys("Brown");
		driver.findElement(By.xpath("//select[@name='Birthday_day']")).click();
		WebElement birthday=driver.findElement(By.xpath("//select[@name='Birthday_day']"));
		CommondMethods.selectValueFromDD(birthday, "16");
		driver.findElement(By.xpath("//select[@name='Birthday_Month']")).click();
		WebElement bdayMonth=driver.findElement(By.xpath("//select[@name='Birthday_Month']"));
		CommondMethods.selectValueFromDD(bdayMonth, "Jul");
	}

}