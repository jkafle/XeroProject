package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.xero.com/us/");
		
		WebElement login = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		clickAction(login);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		textEnter(email, "jaya_kafle009@yahoo.com");
		
		WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
		textEnter(pw, "bagmatiB1");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		clickAction(submitButton);
		
		WebElement account = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']"));
		clickAction(account);
		
		WebElement logout = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[5]/div[1]/div[2]/div[1]/ol[1]/li[5]/a[1]"));
		clickAction(logout);
		
		
		
		
	}

}
