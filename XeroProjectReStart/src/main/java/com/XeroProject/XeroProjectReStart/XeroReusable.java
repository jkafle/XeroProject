package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.WebElement;

public class XeroReusable {

	public static void textEnter(WebElement obj, String value) throws InterruptedException {
		
		if(obj.isDisplayed()) {
		Thread.sleep(3000);	
		obj.sendKeys(value);
		System.out.println("The value is successfully entered!");
		}
		else {
			System.out.println("The field does not exist!");
		}
	}
	public static void clickAction(WebElement obj) throws InterruptedException {
		Thread.sleep(3000);
		obj.click();
	}
}
