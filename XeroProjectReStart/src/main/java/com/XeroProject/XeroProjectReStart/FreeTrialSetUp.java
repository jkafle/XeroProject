package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeTrialSetUp extends XeroReusable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		
		WebElement freeTrial = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		clickAction(freeTrial);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
		textEnter(FirstName, "jay");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='LastName']"));
		textEnter(LastName, "kaf");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		textEnter(email, "jaya_kafle009@yahoo.com");
		
		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		textEnter(phoneNum, "5103345678");
		
		/*WebElement selectCountry = driver.findElement(By.xpath("//select[@name='LocationCode']"));
		clickAction(selectCountry);
		SelectByVisibleText(selectCountry, "USA");*/
		
		WebElement termsAccepted = driver.findElement(By.xpath("//input[@value='true']"));
		clickAction(termsAccepted);
		
		WebElement getStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		clickAction(getStarted);
		
		
	}

}
