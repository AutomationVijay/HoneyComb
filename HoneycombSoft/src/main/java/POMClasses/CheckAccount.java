package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckAccount {

	@FindBy(xpath = "//td[text()='Vijay Navgire']")
	private WebElement name;
	@FindBy(xpath = "(//tbody[@data-test=\"table-body\"])//td[contains(text(),'Vijay Navgire')]//following-sibling::"
			+ "td//following-sibling::td//following-sibling::"
			+ "td//following-sibling::td//following-sibling::td//following-sibling::td")
	private WebElement edit;

	public CheckAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String CheckAcc() {
		String acc = name.getText();
		return acc;
	}

	public void EditAccount() {
		edit.click();
	}

}
