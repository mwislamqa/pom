package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BassClass;
import com.page.LoginPage;

public class TestRunner extends BassClass{
	
	
	
	

		public LoginPage lg;

		@BeforeTest
		public void Initialised() {
			setUp();
			 lg = new LoginPage();

		}

		@Test
		public void LoginTest() {
			lg.Login("standard_user","secret_sauce");

		}

		@AfterTest
		public void driverClose() throws InterruptedException {
			Thread.sleep(400);
			driver.close();
		}

	}


