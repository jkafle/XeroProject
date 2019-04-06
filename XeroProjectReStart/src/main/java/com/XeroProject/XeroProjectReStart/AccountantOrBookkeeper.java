package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountantOrBookkeeper extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.xero.com/");
		
		WebElement trialClick = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		clickAction(trialClick);
		
		WebElement Accountant = driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		clickAction(Accountant);
	}

}
