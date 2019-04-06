package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TermsXero extends XeroReusable{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.xero.com/us/");
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		clickAction(signup);
		
		WebElement terms = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		clickAction(terms);
		
		WebElement privacyPolicy = driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		clickAction(privacyPolicy);
	}

}
