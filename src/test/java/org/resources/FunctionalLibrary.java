package org.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\New folder (2)\\CucumberProjectClass\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(url);

	}
	
	public static void insertValue(WebElement element,String input) {
		
             element.sendKeys(input);
	}
	
	public static void button(WebElement element) {
		
           element.click();
	}

}
