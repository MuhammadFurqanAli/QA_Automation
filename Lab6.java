package Lab6TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab6 {
    @BeforeTest
    public void openWebPage() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");
		// Create New WebDriver and maximize it
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// DEFINING URL TO GO TO and Then Called Driver to Go There
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject";
		driver.get(baseurl);
    }
	@Test
	public void Manager() {

		// Gave Location of Chrome Web Driver
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\ACER\\Desktop\\CureMD\\QA_Automation\\Java\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");
		// Create New WebDriver and maximize it
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// DEFINING URL TO GO TO and Then Called Driver to Go There
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject";
		driver.get(baseurl);

		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// Hit Manager Button After Wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='manager()']")));
		WebElement elementLocator = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='addCust()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='addCust()']"));
		actions.click(elementLocator).perform();

		// Add Customer Details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='fName']")));
		driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys("Malik");
		driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("4123");
		elementLocator = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		actions.click(elementLocator).perform();
		driver.switchTo().alert().accept();

		// Hit Manager Button After Wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='openAccount()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='openAccount()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='userSelect']")));
		elementLocator = driver.findElement(By.xpath("//select[@id='userSelect']"));
		actions.clickAndHold(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Ron Weasly']")));
		driver.findElement(By.xpath("//option[text()='Ron Weasly']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='currency']")));
		elementLocator = driver.findElement(By.xpath("//select[@id='currency']"));
		actions.clickAndHold(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Ron Weasly']")));
		driver.findElement(By.xpath("//option[text()='Pound']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		elementLocator = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(elementLocator).perform();
		driver.switchTo().alert().accept();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='home()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='home()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='customer()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='userSelect']")));
		elementLocator = driver.findElement(By.xpath("//select[@id='userSelect']"));
		actions.clickAndHold(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Ron Weasly']")));
		driver.findElement(By.xpath("//option[text()='Ron Weasly']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		elementLocator = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='deposit()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='deposit()']"));
		actions.click(elementLocator).perform();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@class,'form-control')]")));
		driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]")).sendKeys("5000");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		elementLocator = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-class='btnClass3']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Withdraw']")));
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2000");
		elementLocator = driver.findElement(By.xpath("//button[@type='submit']"));
		actions.click(elementLocator).perform();

		elementLocator = driver.findElement(By.xpath("//button[@ng-click='transactions()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='start']")));
		driver.findElement(By.xpath("//input[@id='start']")).sendKeys("2022-08-15T21:33:44");
		driver.findElement(By.xpath("//input[@id='end']")).sendKeys("2022-08-15T22:03:44");

		elementLocator = driver.findElement(By.xpath("//button[@ng-click='reset()']"));
		actions.click(elementLocator).perform();

		elementLocator = driver.findElement(By.xpath("//button[@class='btn logout']"));
		actions.click(elementLocator).perform();

		elementLocator = driver.findElement(By.xpath("//button[@class='btn home']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='manager()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='showCust()']")));
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='showCust()']"));
		actions.click(elementLocator).perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='deleteCust(cust)']")));
		driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]")).sendKeys("Ron");
		elementLocator = driver.findElement(By.xpath("//button[@ng-click='deleteCust(cust)']"));
		actions.click(elementLocator).perform();

	}
}
