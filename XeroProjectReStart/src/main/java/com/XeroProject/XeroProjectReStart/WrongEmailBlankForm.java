package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongEmailBlankForm extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.xero.com/us/");
		
		WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		clickAction(freeTrial);
		
		WebElement getStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		clickAction(getStarted);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		textEnter(email, "123.com");
		
		WebElement getStarted2 = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		clickAction(getStarted2);
		
		
	}

}
