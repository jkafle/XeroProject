package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.xero.com/us/");
		WebElement forgotPw=driver.findElement(By.xpath("//a[contains(@class,'forgot-password-advert')]"));
		clickAction(forgotPw);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='UserName']"));
		textEnter(email, "jaya_kafle009@yahoo.com");
		
		WebElement sendLink = driver.findElement(By.xpath("//span[contains(@class,'text')]"));
		clickAction(sendLink);
		

	}

}
