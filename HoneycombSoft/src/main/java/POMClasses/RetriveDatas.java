package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetriveDatas 
{


	@FindBy(xpath = "//input[@name=\"AccountShortName\"]")
	private WebElement shortName;
	@FindBy(xpath = "//input[@name=\"AccountName\"]")
	private WebElement AccountName;
	@FindBy(xpath = "//div[contains(text(),\"Select Country\")]")
	private WebElement country;
	@FindBy(xpath = "//div[contains(text(),'India')]")
	private WebElement selCountry;
	@FindBy(xpath = "//div[contains(text(),\"State\")]")
	private WebElement state;
	@FindBy(xpath = "//div[contains(text(),'Arunachal Pradesh')]")
	private WebElement selState;
	@FindBy(xpath = "//input[@name=\"AccountPanNo\"]")
	private WebElement panCard;
	@FindBy(xpath = "//input[@name=\"CreditDays\"]")
	private WebElement creditDays;
	@FindBy(xpath = "//div[contains(text(),\"Select Group Code\")]")
	private WebElement group;
	@FindBy(xpath = "//div[contains(text(),'Maninagar')]")
	private WebElement selGroup;
	@FindBy(xpath = "//input[@name=\"PsfasAccount\"]")
	private WebElement fasAccount;
	@FindBy(xpath = "//div[contains(text(),\"Select City\")]")
	private WebElement city;
	@FindBy(xpath = "//div[contains(text(),'Itanagar')]")
	private WebElement selCity;
	@FindBy(xpath = "//input[@name=\"AccountPincode\"]")
	private WebElement pinCode;
	@FindBy(xpath = "//input[@name=\"BankName\"]")
	private WebElement bankName;
	@FindBy(xpath = "//input[@name=\"BankAccountNo\"]")
	private WebElement BankAccNo;
	@FindBy(xpath = "//input[@id=\"react-select-5-input\"]")
	private WebElement manager;
	@FindBy(xpath = "//div[contains(text(),'Select Parent Code')]")
	private WebElement parentCode;
	@FindBy(xpath = "//div[contains(text(),'Mrugdha')]")
	private WebElement parentSel;
	@FindBy(xpath = "//input[@name=\"Mobile\"]")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name=\"OtherMobileNo\"]")
	private WebElement otherMobile;
	@FindBy(xpath = "//input[@name=\"BankAccountAlias\"]")
	private WebElement BankAccAs;
	@FindBy(xpath = "//input[@name=\"BankAddress\"]")
	private WebElement bankAddress;
	/*
	@FindBy(xpath = "//input[@name=\"ContactPerson\"]")
	private WebElement reference;
	@FindBy(xpath = "//input[@name=\"Designation\"]")
	private WebElement designation;
	@FindBy(xpath = "//input[@name=\"AccountPhone\"]")
	private WebElement accPhone;
	@FindBy(xpath = "//input[@name=\"AccountEmail\"]")
	private WebElement accEmail;
	@FindBy(xpath = "//input[@name=\"IfscCode\"]")
	private WebElement ifsc;
	@FindBy(xpath = "//input[@name=\"MsmeCode\"]")
	private WebElement msme;
	@FindBy(xpath = "//input[@name=\"AccountUrl\"]")
	private WebElement accUrl;
	@FindBy(xpath = "//textarea[@name=\"Address\"]")
	private WebElement address;
	@FindBy(xpath = "//textarea[@name=\"Remarks\"]")
	private WebElement remark;
	@FindBy(xpath = "//input[@name=\"Area\"]")
	private WebElement area;
	@FindBy(xpath = "//input[@name=\"AccountGstNo\"]")
	private WebElement gst;
	@FindBy(xpath = "//input[@name=\"DateOfBirth\"]")
	private WebElement dob;
	@FindBy(xpath = "//input[@name=\"DateOfAnniversary\"]")
	private WebElement doa;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submit;
*/
	public RetriveDatas(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String AddNewAcc() {
		String an = shortName.getAttribute("value");
		return an;
	}

	public String AccNames() {
		String an = AccountName.getAttribute("value");
		return an;
	}

	public String selCountry() {
		String sc = selCountry.getText();
		return sc;
	}

	public String SelState() {
		String sc = selState.getText();
		return sc;
		
	}

	public String PanCard() {
		String pc = panCard.getAttribute("value");
		return pc;
	}

	public String CreditDays() {
		String cd = creditDays.getAttribute("value");
		return cd;
	}

	public String SelGroup() {
		String sg = selGroup.getText();
		return sg;
	}

	public String PSFASAccount() {
		String fa = fasAccount.getAttribute("value");
		return fa;
	}


	public String SelCity() {
		String sc = selCity.getText();
		return sc;
	}

	public String PinCode() {
		String pc = pinCode.getAttribute("value");
		return pc;
		}

	public String BankName() {
		String bn = bankName.getAttribute("value");
		return bn;
	}

	public String BankAccountNo() {
		String ban = BankAccNo.getAttribute("value");
		return ban;
	}


	public String ParentCodeSel() {
		String ps = parentSel.getText();
		return ps;
	}

	public String Mobile() {
		String m = mobile.getAttribute("value");
		return m;
	}

	public String OtherMobile() {
		String om = otherMobile.getAttribute("value");
		return om;
	}

	public String BankAccountAs() {
		String baa= BankAccAs.getAttribute("value");
		return baa;
	}

	public String BankAddress() {
		String ba= bankAddress.getAttribute("value");
		return ba;
	}
/*
	public String ContactPerson() {
		String ref = reference.getAttribute("value");
		return ref;
	}

	public String Designation() {
		String des= designation.getAttribute("value");
		return des;
	}

	public String AccountPhone() {
		String ap = accPhone.getAttribute("value");
		return ap;
	}

	public String AccountEmail() {
		String ae = accEmail.getAttribute("value");
		return ae;
	}

	public String IFSC() {
		String ifs = ifsc.getAttribute("value");
		return ifs;
	}

	public String MSME() {
		String ms = msme.getAttribute("value");
		return ms;
	}

	public String AccountURL() {
		String au = accUrl.getAttribute("value");
		return au;
	}

	public String Address() {
		String ad = address.getAttribute("values");
		return ad;
	}

	public void Remark(String rem) {
		remark.sendKeys(rem);
	}

	public void Area(String ar) {
		area.sendKeys(ar);
	}

	public void AccGST(String GstNo) {
		gst.sendKeys(GstNo);
	}

	public void DOB(String birthD) {
		dob.sendKeys(birthD);
	}

	public void DOA(String birthA) {
		doa.sendKeys(birthA);
	}

	public void Submit() {
		submit.click();
	}


*/
}
