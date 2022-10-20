package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BassClass {
	
	// all drivers
	
	 public static WebDriver driver;
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

}
