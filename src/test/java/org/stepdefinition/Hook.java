package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary {
	
	//public static WebDriver driver;
	
	@Before
	public void beforeBackground() {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Asus\\Desktop\\New folder (2)\\CucumberProjectClass\\Driver\\chromedriver.exe"
		 * ); driver=new ChromeDriver(); driver.get("http://demo.guru99.com/telecom/");
		 */
		
		launchBrowser("http://demo.guru99.com/telecom/");
		

	}
	
	@After
	public void afterMethod() {
		
		driver.quit();

	}

}
