package com.BEd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.BEd.browser.BrowserFactoryNew;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void Startup() {

		driver = BrowserFactoryNew.StartApplication();

	}

	@AfterClass
	public void QuitBrowser() {

		BrowserFactoryNew.Quit();

	}

}
