package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUserNamePwLogin extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.xero.com/us/");
		
		WebElement emailAddress= driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
		textEnter(emailAddress, "user@gmail.com");
		
		WebElement pw = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		textEnter(pw, "pwd");
		
		WebElement clickObj = driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickAction(clickObj);
		
	}

}
