package com.bjs.opensourceObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
//1.Locators Instance variable
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By submit=By.id("wp-submit");
	
public Login (WebDriver driver) {
	this.driver=driver;
}
	
	//2.For Every operation,create seprate method
public void typeUsername() {
	driver.findElement(username).sendKeys("opensourcecms");
}

public void typePassword() {
	driver.findElement(password).sendKeys("opensourcecms");

}

public void clickOnSubmit() {
	driver.findElement(submit).click();
}

}
