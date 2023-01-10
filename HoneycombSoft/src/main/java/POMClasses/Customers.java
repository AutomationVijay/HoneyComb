package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers {

	@FindBy(xpath = "//a[contains(text(),\"Add New\")]")
	private WebElement addNew;

	public Customers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void AddNew() {
		addNew.click();
	}
}
