package com.bjs.opensourceObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	
	//1.Locators Instance variable
By comment=By.xpath("//div[text()='Komentarze ']");


	public Home (WebDriver driver) {
		this.driver=driver;
	}
	
	//2.Every operation create seprate method

	public void clickOnComment() {
		driver.findElement(comment).click();
		System.out.println("1st change");
	}
	
}

