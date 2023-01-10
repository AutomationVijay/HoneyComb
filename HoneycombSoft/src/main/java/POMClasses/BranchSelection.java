package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchSelection {
	
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement LoginBtn;
	@FindBy(xpath = "//div[@class=\" css-1uccc91-singleValue\"]") private WebElement Year;
	
	

	public BranchSelection(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String PresentYear() 
	{
		String years = Year.getText();
		return years;
	}
	
	public void Submit()
	{
		LoginBtn.click();
	}

}
