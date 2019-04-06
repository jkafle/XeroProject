package com.XeroProject.XeroProjectReStart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		System.out.println("Item successfully clicked!");
	}
	public static void SelectByVisibleText(WebElement obj, String value) throws InterruptedException {
		Thread.sleep(3000);
		Select country = new Select(obj);
		country.selectByVisibleText(value);
		
	}
	
	
}
