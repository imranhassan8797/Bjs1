package com.bjs.opensourceObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
//1.Locators Instance variable
By signin=By.linkText("Zaloguj się");
	
public Welcome(WebDriver driver) {
	
	this.driver=driver;
}
//2.For Every operation,create seprate method

public void clickOnSignIn() {
	driver.findElement(signin).click();
}
	
	
}