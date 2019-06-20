package com.classPracticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommondMethods;
//open chrome browser
		//go to "http://uitestpractice.com/"
		//click on "forms" Link
		//fill out entire form
		//close the browser
public class Class10Task1 extends CommondMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://uitestpractice.com");
		driver.findElement(By.xpath("//a[@href='/Students/Form']")).click();
		sendText(driver.findElement(By.xpath("//input[@id='firstname']")),"Scott");
		sendText(driver.findElement(By.xpath("//input[@id='lastname']")),"Brown");
		
		List <WebElement> radioStatus=driver.findElements(By.xpath("//input[@name='optradio']"));
		for(WebElement status:radioStatus) {
			//String value=status.getAttribute("text");
			if(status.isEnabled()) {
		radioStatus.get(1).click();
				break;
			}
			
		}
				List <WebElement> list=driver.findElements(By.xpath("//label[@class='checkbox-inline']"));
				for(WebElement status2:list) {
					//String value=status2.getAttribute("value");
					if(status2.isEnabled()) {
				list.get(0).click();
						break;
			}
		}
		
				WebElement DropD=driver.findElement(By.xpath("//select[@id='sel1']"));
				Select select=new Select(DropD);
				select.selectByVisibleText("Egypt");
				
				driver.findElement(By.cssSelector("input#datepicker")).click();
                
		        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		        Select selectMonth = new Select(month);
		        selectMonth.selectByVisibleText("Jul");
		                        
		        WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		        Select selectYear = new Select (year);
		        selectYear.selectByVisibleText("1970");
		                        
		       //To select calendar day
		        String expectedValue = "16";
		                        
		        List <WebElement> days =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		        for (WebElement day: days) {
		        String dayText=day.getText();
		        if (dayText.equals(expectedValue)) {
		        day.click();
				
		        driver.findElement(By.xpath("//input[@id='phonenumber']")).click();
		        sendText(driver.findElement(By.xpath("//input[@id='phonenumber']")),"5555555555");
		        sendText(driver.findElement(By.xpath("//input[@id='username']")),"JavaJets");
		        sendText(driver.findElement(By.xpath("//input[@id='email']")),"JavaJets@gmail.com");
		        sendText(driver.findElement(By.xpath("//textarea[@class='form-control test']")),"this is hard");
		        sendText(driver.findElement(By.xpath("//input[@id='pwd']")),"123456");
		        driver.findElement(By.xpath("//button[@type='submit']")).click();
		      
	}


				}
}
}








