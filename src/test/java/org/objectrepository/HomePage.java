package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTariff;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getAddTariff() {
		return addTariff;
	}
	
	

}
