package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name=\"username\"]") private WebElement UserName;
	@FindBy(xpath = "//input[@name=\"password\"]") private WebElement PassWord;
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement LoginBtn;
	
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void SendUserName(String UserNmae)
	{
		UserName.sendKeys(UserNmae);
	}
	
	public void SendPassWord(String PassWordUser)
	{
		PassWord.sendKeys(PassWordUser);
	}
	
	public void Submit()
	{
		LoginBtn.click();
	}

}
