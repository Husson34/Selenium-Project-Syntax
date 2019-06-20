package com.classPracticeselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextIterator {

	public static void main(String[] args) {
			//1.Open chrome browser
			//2.Go to “https://www.amazon.com/”
			//3.Using Iterator get text of each link
			//4.Get number of links that has text
		System.setProperty("webdriver.chrome.driver", "\\Users\\ScottBrown\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));//capture all links into array
		int count=0;//start count of links
		Iterator<WebElement> linksIt=links.iterator();
		while(linksIt.hasNext()){
			String linkText=linksIt.next().getText();
			if(!linkText.isEmpty()){
				System.out.println(linkText);
				count++;
			}
			
		}
		System.out.println("total number of links with text "+count);
		driver.quit();
		
		
	}

}
