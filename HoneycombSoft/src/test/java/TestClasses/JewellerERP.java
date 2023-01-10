package TestClasses;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import LibraryClasses.BaseClass;
import LibraryClasses.UtilityClass;
import POMClasses.BranchSelection;
import POMClasses.CheckAccount;
import POMClasses.CreateAccount;
import POMClasses.Customers;
import POMClasses.Dashboards;
import POMClasses.LoginPage;
import POMClasses.RetriveDatas;
import POMClasses.UpdateAccount;
import net.bytebuddy.utility.RandomString;

public class JewellerERP extends BaseClass {

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtendReport.html");

	LoginPage login;
	BranchSelection branch;
	Dashboards dash;
	Customers addNew;
	CreateAccount createAcc;
	CheckAccount check;
	UpdateAccount update;
	RetriveDatas retrive;

	@BeforeTest(alwaysRun = true)
	public void openBrowser() throws IOException {
		initialiseBrowser(UtilityClass.getData("URL"));

		extent.attachReporter(spark);
		login = new LoginPage(driver);
		branch = new BranchSelection(driver);
		dash = new Dashboards(driver);
		addNew = new Customers(driver);
		createAcc = new CreateAccount(driver);
		check = new CheckAccount(driver);
		update = new UpdateAccount(driver);
		retrive = new RetriveDatas(driver);

	}

	@Test(priority = 1)
	public void LoginPage() throws IOException {

		ExtentTest test = extent.createTest("Verify Report and Analytics");

		String currentUrl = driver.getCurrentUrl();
		test.pass(currentUrl);
		boolean ExpectedFirst = currentUrl.contains("jewellerdev");
		if (ExpectedFirst) {
			login.SendUserName(UtilityClass.getData("UserName"));
			login.SendPassWord(UtilityClass.getData("Password"));
			login.Submit();
			test.pass("Login Successful with ");
		} else {
			test.pass("Cant Perform because URL is not as per Required");
		}

	}

	@Test(priority = 2)
	public void BranchSelection() throws InterruptedException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String branchUrl = driver.getCurrentUrl();
		boolean ExpectedFirst = branchUrl.contains("branch");
		if (ExpectedFirst) {

			String CurrentYear = branch.PresentYear();
			boolean ExpectedYear = CurrentYear.contains("2022-2023");
			if (ExpectedYear) {
				branch.Submit();
				test.pass("Branch Submitted");
			} else {
				test.pass("Year not selected as per guideline");
			}

		} else {
			test.pass("URL dose not match");
		}

	}

	@Test(priority = 3)
	public void Dashboards() throws InterruptedException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String dashboardUrl = driver.getCurrentUrl();
		boolean Expecteddashboard = dashboardUrl.contains("dashboard");
		if (Expecteddashboard) {
			dash.Masters();
			Thread.sleep(1000);
			dash.Acounts();
			Thread.sleep(1000);
			dash.Customers();

			test.pass("Dashboard submitted");

		} else {
			test.pass("URL dose not match");
		}

	}

	@Test(priority = 4)
	public void Customers() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String customerUrl = driver.getCurrentUrl();
		boolean ExpectedCustomer = customerUrl.contains("account");

		String AccChecks = check.CheckAcc();
		boolean ExpectedAccount = AccChecks.contains(UtilityClass.getData("Act_Name"));

		if (ExpectedCustomer && ExpectedAccount) {
			check.EditAccount();
			UpdateAccount();
			test.pass("Account updated here");
		}

		else if (ExpectedCustomer) {
			addNew.AddNew();
			CreateAccount();
			test.pass("Account Created");
		}

		else {
			test.pass("URL dose not match");
		}
	}

	public void CreateAccount() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String createUrl = driver.getCurrentUrl();
		boolean ExpectedCustomer = createUrl.contains("manage");
		if (ExpectedCustomer) {

			createAcc.AddNew(UtilityClass.getData("AC_As_Name"));
			createAcc.AccName(UtilityClass.getData("Act_Name"));
			createAcc.Country();
			createAcc.selCountry();
			createAcc.State();
			createAcc.SelState();
			createAcc.PanCard(UtilityClass.getData("Pan_No"));
			createAcc.CreditDays(UtilityClass.getData("Credit_Days"));
			createAcc.Group();
			createAcc.SelGroup();
			createAcc.PSFASAccount(UtilityClass.getData("PSFAS"));
			createAcc.City();
			createAcc.SelCity();
			createAcc.PinCode(UtilityClass.getData("Pin_Code"));
			createAcc.BankName(UtilityClass.getData("Bank_Name"));
			createAcc.BankAccountNo(UtilityClass.getData("Bank_Acc_No"));
			createAcc.Manager(UtilityClass.getData("Manager"));
			createAcc.ParentCode();
			createAcc.ParentCodeSel();

			Random rand = new Random();
			int rand_int1 = rand.nextInt(1000);
			String nm = UtilityClass.getData("Mobile");
			int mo = Integer.parseInt(nm);
			String m = mo + "" + rand_int1;
			createAcc.Mobile(m);

			createAcc.OtherMobile(UtilityClass.getData("Other_Mob"));
			createAcc.BankAccountAs(UtilityClass.getData("Bank_Act_As"));
			createAcc.BankAddress(UtilityClass.getData("Bank_Address"));
			createAcc.ContactPerson(UtilityClass.getData("Reference"));
			createAcc.Designation(UtilityClass.getData("Designation"));
			createAcc.AccountPhone(UtilityClass.getData("Phone"));

			String email = RandomString.make(4);
			String abc = UtilityClass.getData("Email");
			String ab = email + "" + abc;
			createAcc.AccountEmail(ab);

			createAcc.IFSC(UtilityClass.getData("IFSC"));
			createAcc.MSME(UtilityClass.getData("MSME"));
			createAcc.AccountURL(UtilityClass.getData("URLS"));
			createAcc.Address(UtilityClass.getData("Address"));
			createAcc.Remark(UtilityClass.getData("Remark"));
			createAcc.Area(UtilityClass.getData("Area"));
			createAcc.AccGST(UtilityClass.getData("GST"));
			createAcc.DOB(UtilityClass.getData("DOB"));
			createAcc.DOA(UtilityClass.getData("DOA"));
			createAcc.Submit();

		} else {
			test.pass("URL dose not match");
		}
	}

	public void UpdateAccount() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String updateUrl = update.Update();
		boolean ExpectedCustomer = updateUrl.contains("Update");
		if (ExpectedCustomer) {
			Thread.sleep(1000);
			update.Reset();
			test.pass("updating Account");
			CreateAccount();

		}

	}

	@Test(priority = 5)
	public void RetriveDatas() throws InterruptedException, IOException {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		Thread.sleep(1000);
		String customerUrl = driver.getCurrentUrl();
		boolean ExpectedCustomer = customerUrl.contains("account");

		String AccChecks = check.CheckAcc();
		boolean ExpectedAccount = AccChecks.contains(UtilityClass.getData("Act_Name"));

		if (ExpectedCustomer && ExpectedAccount) {
			check.EditAccount();

			String ana = retrive.AddNewAcc();
			System.out.println(ana);

			String an = retrive.AccNames();
			System.out.println(an);

			String sc = retrive.selCountry();
			System.out.println(sc);

			String state = retrive.SelState();
			System.out.println(state);

			String pan = retrive.PanCard();
			System.out.println(pan);

			String cd = retrive.CreditDays();
			System.out.println(cd);

			String g = retrive.SelGroup();
			System.out.println(g);

			String psf = retrive.PSFASAccount();
			System.out.println(psf);

			String c = retrive.SelCity();
			System.out.println(c);

			String pi = retrive.PinCode();
			System.out.println(pi);

			String bn = retrive.BankName();
			System.out.println(bn);

			String ba = retrive.BankAccountNo();
			System.out.println(ba);

			String pcs = retrive.ParentCodeSel();
			System.out.println(pcs);

			String mobs = retrive.Mobile();
			System.out.println(mobs);

			String omob = retrive.OtherMobile();
			System.out.println(omob);

			String baa = retrive.BankAccountAs();
			System.out.println(baa);

			String badd = retrive.BankAddress();
			System.out.println(badd);

		}
	}

	/*
	 * @Test(priority = 5) public void Delete() throws InterruptedException {
	 * Thread.sleep(1000); String customerUrl = update.Update();
	 * System.out.println(customerUrl); boolean ExpectedCustomer =
	 * customerUrl.contains("Update"); if (ExpectedCustomer) { Thread.sleep(1000);
	 * update.Reset(); createAcc.Submit(); }
	 * 
	 * }
	 */

	@AfterTest
	public void CloseBrowser() {
		ExtentTest test = extent.createTest("Verify Report and Analytics");
		test.pass("Browser closed");
		driver.quit();
	}

}
