package Lab6TestNG;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab6 {
	public String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject";
	public WebDriver driver; 
	public Actions actions;
	public WebDriverWait wait;
	
	@BeforeTest
    public void openWebPage() {
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\CureMD\\QA_Automation\\Java\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");
		// Create New WebDriver and maximize it
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		//Create Actions & Wait Objects
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
    }
	
	
	
	
	public void ActionsWaitClick(String xpath) {
		WebElement elem= WaitXpath(xpath);
		actions.click(elem).perform();
	}
	public void ActionsClickAndHold(WebElement elem) {
		actions.clickAndHold(elem).perform();
	}
	public WebElement WaitXpath(String xpath) {
		WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return elem;
	}
	public void ManagerLoginButtonClick() {
		//String xpath = "//button[@ng-click='manager()']";
		WebElement elem = WaitXpath("//button[@ng-click='manager()']");
		actions.click(elem).perform();
	}
	
	public void AddCustomerMainButtonClick(String firstName, String lastName, String postalCode) {
		ActionsWaitClick("//button[@ng-click='addCust()']");
		//WebElement addCustomer = WaitXpath("//button[@ng-click='addCust()']");
		//actions.click(addCustomer).perform();
		// Add Customer Details and Handle Alert
		WebElement fName = WaitXpath("//input[@ng-model='fName']");
		fName.sendKeys(firstName);
		WebElement lName = WaitXpath("//input[@ng-model='lName']");
		lName.sendKeys(lastName);
		WebElement postCode = WaitXpath("//input[@ng-model='postCd']");
		postCode.sendKeys(postalCode);
		ActionsWaitClick("//button[@class='btn btn-default']");
		//WebElement addCustBut = WaitXpath("//button[@class='btn btn-default']");
		//actions.click(addCustBut).perform();
		AlertAccept();
	}
	
	public void AlertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void HomeButtonClick() {
		ActionsWaitClick("//button[@class='btn btn-default']");
		//WebElement homeBut = WaitXpath("//button[@ng-click='home()']");
		//actions.click(homeBut).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority = 0)
	public void ManagerAddCustomer() {
		
		// Hit Manager Button After Wait
		WebElement managerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='manager()']")));
		actions.click(managerButton).perform();
		
		// Hit Add Customer After Wait
		WebElement addCustomer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='addCust()']")));
		actions.click(addCustomer).perform();

		// Add Customer Details and Handle Alert
		WebElement fName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='fName']")));
		fName.sendKeys("Malik");
		WebElement lName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='lName']")));
		lName.sendKeys("Ajay");
		WebElement postCode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='postCd']")));
		postCode.sendKeys("4123");
		WebElement addCustBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-default']")));
		actions.click(addCustBut).perform();
		driver.switchTo().alert().accept();
	}
	@Test(priority = 1)
	public void OpenCustomerAccount() {
		// Hit Open Account 
		WebElement openAcc= driver.findElement(By.xpath("//button[@ng-click='openAccount()']"));
		actions.click(openAcc).perform();

		WebElement userSelect= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='userSelect']")));
		actions.clickAndHold(userSelect).perform();

		WebElement textName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Malik Ajay']")));
		textName.click();

		WebElement currency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='currency']")));
		actions.clickAndHold(currency).perform();

		WebElement pound = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Pound']")));
		pound.click();

		WebElement submitBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		actions.click(submitBut).perform();
		driver.switchTo().alert().accept();
	}
		@Test(priority = 2)
		public void GoToCustomerLogin() {
		WebElement homeBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='home()']")));
		actions.click(homeBut).perform();

		WebElement customerBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='customer()']")));
		actions.click(customerBut).perform();

		WebElement userSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='userSelect']")));
		actions.clickAndHold(userSelect).perform();

		WebElement textName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Malik Ajay']")));
		textName.click();

		WebElement submitBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		actions.click(submitBut).perform();
		}
		
		@Test(priority = 3)
		public void DepositCashWithdraw() {
		WebElement depositBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='deposit()']")));
		actions.click(depositBut).perform();

		WebElement amount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'form-control')]")));
		amount.sendKeys("10000");

		WebElement submitBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		actions.click(submitBut).perform();

		
		WebElement withdrawlBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='withdrawl()']")));
		withdrawlBut.click();

		WebElement amountW = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Amount to be Withdrawn :']//following::input")));
		//amount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'form-control')]")));
		amountW.sendKeys("2000");
		
		//WebElement withdrawAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Withdraw']")));
		WebElement withdrawAmount = driver.findElement(By.xpath("//button[text()='Withdraw']"));
		actions.click(withdrawAmount).perform();
		}
		@Test(priority = 4)
		public void Transactions() {
		WebElement transactionsbut  = driver.findElement(By.xpath("//button[@ng-click='transactions()']"));
		actions.click(transactionsbut).perform();

		WebElement startDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='start']")));
		startDateTime.sendKeys("2022-08-15T21:33:44");
		WebElement endDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='start']")));
		endDateTime.sendKeys("2022-08-17T21:33:44");
		}
		@Test(priority = 5)
		public void ResetTransactionsLogout() {
		WebElement resetBut = driver.findElement(By.xpath("//button[@ng-click='reset()']"));
		actions.click(resetBut).perform();

		WebElement logoutBut = driver.findElement(By.xpath("//button[@class='btn logout']"));
		actions.click(logoutBut).perform();
		}
		@Test(priority = 6)
		public void ManagerLoginDeleteCustomer() {
		WebElement homeBut = driver.findElement(By.xpath("//button[@class='btn home']"));
		actions.click(homeBut).perform();

		WebElement managerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='manager()']")));
		actions.click(managerButton).perform();

		WebElement showCust = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='showCust()']")));
		actions.click(showCust).perform();

		
		WebElement delCust = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'form-control')]")));
		delCust.sendKeys("Malik");
		
		WebElement delCustBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='deleteCust(cust)']")));
		actions.click(delCustBut).perform();

		//delCust = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'form-control')]")));
		//delCust.clear();
		
		//homeBut = driver.findElement(By.xpath("//button[@class='btn home']"));
		//actions.click(homeBut).perform();
	}
	@AfterTest
	public void quitDriver() {
		
		driver.quit();
	}
	
}
