package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.opensourceObject.Home;
import com.bjs.opensourceObject.Login;
import com.bjs.opensourceObject.Welcome;

public class OpenSourceTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		
		Welcome w = new Welcome(driver);//Welcome Page
		w.clickOnSignIn();
		
		
		Login l = new Login(driver);//Login page
		l.typeUsername();
		l.typePassword();
		l.clickOnSubmit();
		
		Home h = new Home(driver);//Home Page
		h.clickOnComment();
		
		driver.close();
	}

}
