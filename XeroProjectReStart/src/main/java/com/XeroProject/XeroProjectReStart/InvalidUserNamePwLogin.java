package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUserNamePwLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/jayakafle/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	}

}
