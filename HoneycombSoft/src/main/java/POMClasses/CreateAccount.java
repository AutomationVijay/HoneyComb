package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

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

	public CreateAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void AddNew(String AccAsName) {
		shortName.sendKeys(AccAsName);
	}

	public void AccName(String AccName) {
		AccountName.sendKeys(AccName);
	}

	public void Country() {
		country.click();
	}

	public void selCountry() {
		selCountry.click();
	}

	public void State() {
		state.click();
	}

	public void SelState() {
		selState.click();
	}

	public void PanCard(String pan) {
		panCard.sendKeys(pan);
	}

	public void CreditDays(String day) {
		creditDays.sendKeys(day);
	}

	public void Group() {
		group.click();
	}

	public void SelGroup() {
		selGroup.click();
	}

	public void PSFASAccount(String fasAcc) {
		fasAccount.sendKeys(fasAcc);
	}

	public void City() {
		city.click();
	}

	public void SelCity() {
		selCity.click();
	}

	public void PinCode(String pin) {
		pinCode.sendKeys(pin);
	}

	public void BankName(String bankNm) {
		bankName.sendKeys(bankNm);
	}

	public void BankAccountNo(String bnkAccNo) {
		BankAccNo.sendKeys(bnkAccNo);
	}

	public void Manager(String mngr) {
		manager.sendKeys(mngr);
	}

	public void ParentCode() {
		parentCode.click();
	}

	public void ParentCodeSel() {
		parentSel.click();
	}

	public void Mobile(String mob) {
		mobile.sendKeys(mob);
	}

	public void OtherMobile(String otherMob) {
		otherMobile.sendKeys(otherMob);
	}

	public void BankAccountAs(String bankAcc) {
		BankAccAs.sendKeys(bankAcc);
	}

	public void BankAddress(String bankAdd) {
		bankAddress.sendKeys(bankAdd);
	}

	public void ContactPerson(String ref) {
		reference.sendKeys(ref);
	}

	public void Designation(String desig) {
		designation.sendKeys(desig);
	}

	public void AccountPhone(String AccPhone) {
		accPhone.sendKeys(AccPhone);
	}

	public void AccountEmail(String AccEmail) {
		accEmail.sendKeys(AccEmail);
	}

	public void IFSC(String ifses) {
		ifsc.sendKeys(ifses);
	}

	public void MSME(String msmes) {
		msme.sendKeys(msmes);
	}

	public void AccountURL(String AccUrl) {
		accUrl.sendKeys(AccUrl);
	}

	public void Address(String add) {
		address.sendKeys(add);
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

}
