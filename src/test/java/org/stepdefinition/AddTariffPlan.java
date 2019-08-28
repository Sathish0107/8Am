package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlan   {
	
	//static WebDriver driver;
	@Given("user should be telecom homepage")
	public void user_should_be_telecom_homepage() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\New folder (2)\\CucumberProjectClass\\Driver\\chromedriver.exe");
		 //driver=new ChromeDriver();
		//driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user should navigate to Addtariffplan page")
	public void user_should_navigate_to_Addtariffplan_page() {
	   Hook.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user should enter plan details")
	public void user_should_enter_plan_details() {
		Hook.driver.findElement(By.id("rental1")).sendKeys("399");
		Hook.driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("2000");
		Hook.driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys("1000");
		Hook.driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys("400");
		Hook.driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("256");
		Hook.driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys("452");
		Hook.driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys("1");
	}

	@When("user reset the plan details")
	public void user_reset_the_plan_details() {
	    Hook.driver.findElement(By.xpath("//input[@value='Reset']")).click();
	}
	

	@When("user should submit the plan details")
	public void user_should_submit_the_plan_details() {
		//@class
	   Hook.driver.findElement(By.xpath("//ul[@class='actions']/li/input")).click();
	   
	}
	

	@Then("user tariff plan details should get reset")
	public void user_tariff_plan_details_should_get_reset() throws Exception {
		try {
		WebDriverWait w = new WebDriverWait(Hook.driver,200);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='actions']/li/input")));
		try {
		Assert.assertFalse(Hook.driver.findElement(By.xpath("//ul[@class='actions']/li/input")).isEnabled());
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		}finally {
		System.out.println("Done");
		}
		
		
	}
	
	
	@Then("user should not be displayed with congratulation you add tariffplan")
	public void user_should_not_be_displayed_with_congratulation_you_add_tariffplan() {
		
		Assert.assertTrue(Hook.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}
	@When("user should enter plan detailss")
	public void user_should_enter_plan_detailss(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists(String.class);
		
		Hook.driver.findElement(By.id("rental1")).sendKeys(data.get(1).get(0));
		Hook.driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(data.get(3).get(1));
		Hook.driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(data.get(3).get(1));
		Hook.driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(data.get(3).get(2));
		Hook.driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(data.get(3).get(5));
		Hook.driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys(data.get(3).get(4));
		Hook.driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(data.get(3).get(6));
	   
	}

	@When("user should enter plan detail")
	public void user_should_enter_plan_detail(DataTable dataTable) {
		
             List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		Hook.driver.findElement(By.id("rental1")).sendKeys(data.get(1).get("MR"));
		Hook.driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(data.get(3).get("IM"));
		Hook.driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(data.get(3).get("LM"));
		Hook.driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(data.get(3).get("SMS"));
		Hook.driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(data.get(3).get("IMC"));
		Hook.driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys(data.get(3).get("LMC"));
		Hook.driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(data.get(3).get("SMC"));
	   
	}

}
