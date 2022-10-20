package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BassClass;

public class LoginPage extends BassClass{
	
	

	
		@FindBy(id="user-name")
		WebElement UserName;
		@FindBy(id="password")
		WebElement password;
		
		public LoginPage(){
			PageFactory.initElements(driver, this);

			
		} 
		public LoginPage Login(String uName, String pass) {
			UserName.sendKeys(uName);
			password.sendKeys(pass);
			driver.findElement(By.id("login-button")).click();
			return  new LoginPage();
		}
		
		//UserName.sendKeys("standard_user");
		//password.sendKeys("secret_sauce");
}
