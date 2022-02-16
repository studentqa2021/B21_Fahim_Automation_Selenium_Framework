package com.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLoginTestNG;
import com.generic.MercuryTours_BaseLogin;
import com.report.ExtentReport;
import com.util.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTestRun extends ExtentReport {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver = DriverManager.getDriverManager();
		
	}
	
	@Test
	public void getLogin() throws Throwable {
		BaseLoginTestNG.getLogin(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
