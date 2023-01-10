package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboards {
	
	@FindBy(xpath = "(//a[contains(text(),\"Master\")])[1]") private WebElement master;
	@FindBy(xpath = "(//a[contains(text(),\"Account\")])[1]") private WebElement Account;
	@FindBy(xpath = "(//a[contains(text(),\"Customer Master\")])[1]") private WebElement Customer;

	
	

	public Dashboards(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Masters()
	{
		master.click();
	}
	
	public void Acounts()
	{
		Account.click();
	}
	public void Customers()
	{
		Customer.click();
	}

}
