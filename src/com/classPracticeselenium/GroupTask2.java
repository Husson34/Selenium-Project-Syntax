package com.classPracticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.CommondMethods;

public class GroupTask2 extends CommondMethods{

	public static void main(String[] args) {
		/* 
		 * TC 1: Table headers and rows verification
		 * 1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 * 2.Login to the application
		 * 3.Create an Order
		 * 4.Verify order of that person is displayed in the table “List of All Orders”
		 * 5.Click on edit of that specific order
		 * 6.Verify each order details
		 * 7.Update street address
		 * 8.Verify in the table that street has been updated
		 * 9.Close browser
		 */

		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input[id$='username'")).click();
		sendText(driver.findElement(By.cssSelector("input[id$='username'")),"Tester");
		driver.findElement(By.cssSelector("input[id$='password']")).click();
		sendText(driver.findElement(By.cssSelector("input[id$='password'")),"test");
		driver.findElement(By.cssSelector("input[id$='login_button']")).click();
		
		//click order form
		driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
		
		//click on product drop down
		driver.findElement(By.cssSelector("select[id$='ddlProduct']")).click();
	
		Select drpproduct = new Select(driver.findElement(By.cssSelector("select[id$='ddlProduct']")));
		drpproduct.selectByVisibleText("FamilyAlbum");//drop down selection
		
		driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("5");//quantity
		
		
	}

}









