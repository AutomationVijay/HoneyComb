package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateAccount {

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement update;
	@FindBy(xpath = "//button[@type=\"reset\"]")
	private WebElement reset;
	@FindBy(xpath = "//input[@name=\"AccountPincode\"]")
	private WebElement pin;
	@FindBy(xpath = "//input[@name=\"Mobile\"]")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name=\"AccountEmail\"]")
	private WebElement newEmail;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submit;

	public UpdateAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String Update() {
		String up = update.getText();
		return up;
	}

	public void Reset() {
		reset.click();
	}

}
