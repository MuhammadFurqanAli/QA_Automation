import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.Thread;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lab5 {

	public static void main(String[] args) throws InterruptedException {

		// Gave Location of Chrome Web Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");

		// Create New WebDriver and maximize it
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step-0
		// DEFINING URL TO GO TO and Then Called Driver to Go There
		String baseurl = " https://omayo.blogspot.in/";
		driver.get(baseurl);

		// Created Actions Class Object
		Actions actions = new Actions(driver);
		
		// Step-1
		// 1-Entered Your Name in the first text field
		// Located Second Text Box and Scrolled into view
		List<WebElement> ta = driver.findElements(By.xpath("//h2[text()='Text Area Field']//following::textarea"));
		
		actions.sendKeys(ta.get(0), Keys.PAGE_DOWN).perform();
		
		ta.get(0).sendKeys("MUHAMMAD FURQAN ALI");
		System.out.println();

		// 2-Got Text from Text Area 2 Using GetText and printed it
		// Then Cleared Text Area 2 and Entered Text there
		System.out.println("Text Area 2 has Text: " + ta.get(1).getText());
		System.out.println();
		ta.get(1).clear();
		ta.get(1).sendKeys("I am an Electrical Engineer ;)");

		// Upload File
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\4123\\Desktop\\QA Automation\\eclipse-workspace\\TEST_0\\src\\Lab5.java");
		
		// Step-2
		WebElement tab1 = driver.findElement(By.xpath("//table[contains(@id,'table')]"));
		actions.sendKeys(tab1, Keys.PAGE_DOWN).perform();
		String t1 = "";
		List<WebElement> t1el = driver.findElements(By.xpath("//table[contains(@id,'table')]"));

		for (WebElement ele : t1el) {
			t1 = ele.getText();
			System.out.println("Table Has Following Contents: " + t1);
		}
		System.out.println();
		// Entered Username and Password, then hit login button
		WebElement login0 = driver.findElement(By.xpath("//button[@value='LogIn']"));
		actions.sendKeys(login0, Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//form[starts-with(@name,'form')]//input[@type='text']")).sendKeys("Foxi");
		driver.findElement(By.xpath("//form[starts-with(@name,'form')]//input[@type='password']")).sendKeys("beep");
		actions.click(login0).perform();

		// Step-3
		// Found Frame-1 Using xpath and moved to it
		List<WebElement> frame = driver.findElements(By.xpath("//iframe[contains(@id,'iframe')]"));
		driver.switchTo().frame(frame.get(1));
		
		// Back to Parent Frame, Then Found Frame-2 Using xpath and moved to it
		driver.switchTo().parentFrame();
		driver.switchTo().frame(frame.get(2));
		
		// Back to Parent Frame
		driver.switchTo().parentFrame();

		// Entered Username and Password
		WebElement userid = driver.findElement(By.xpath("//input[@name='userid']"));
		actions.sendKeys(userid, Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Foxi it iz");
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("beepboop");
		// driver.findElement(By.xpath("//input[@value='Login']")).click();

		// Clicked login button using actions class and handled/accepted alert
		WebElement login1 = driver.findElement(By.xpath("//input[@value='Login']"));
		actions.click(login1).perform();
		driver.switchTo().alert().accept();

		// Step-4
		// Found Element of multiple selection box and moved to it, then clicked it
		WebElement hyundai= driver.findElement(By.xpath("//option[@value='Hyundaix']"));
		actions.click(hyundai).perform();
		// driver.findElement(By.xpath("//option[@value='Hyundaix']")).click();

		// Found Element of multiple selection box, then clicked & hold it
		// Waited for doc3 option and clicked it
		WebElement oldNewsLetter = driver.findElement(By.xpath("//select[starts-with(@id,'drop')]"));
		actions.clickAndHold(oldNewsLetter).perform();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[starts-with(@id,'drop')]//option[@value='jkl']")));
		
		driver.findElement(By.xpath("//select[starts-with(@id,'drop')]//option[@value='jkl']")).click();

		// Cleared Pre-loaded Textbox and entered hello world
		WebElement tb1 = driver.findElement(By.xpath("//input[starts-with(@id,'textbox')]"));
		actions.sendKeys(tb1, Keys.PAGE_DOWN).perform();
		tb1.clear();
		tb1.sendKeys("hello world");

		// Clicked on Enabled Button/Button2
		WebElement button2= driver.findElement(By.xpath("//button[text()='Button2']"));
		actions.click(button2).perform();
		
		// Clicked on All three buttons
		// Submit
		WebElement submitButton= driver.findElement(By.xpath("//button[text()='Submit']"));
		actions.click(submitButton).perform();
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Login
		WebElement loginButton= driver.findElement(By.xpath("//button[text()='Login']"));
		actions.click(loginButton).perform();
		
		// Register
		WebElement registerButton= driver.findElement(By.xpath("//button[text()='Register']"));
		actions.click(registerButton).perform();
		

		// Clicked 'ClickAfterTextDisappears' Button
		// Handled Alert
		WebElement clickAfterTextDisappers = driver.findElement(By.xpath("//input[@value='ClickAfterTextDissappears']"));
		actions.click(clickAfterTextDisappers).perform();
		driver.switchTo().alert().accept();

		
		// Clicked on open a new popup window anchor
		driver.findElement(By.xpath("//a[starts-with(@href,'JavaScript:newPopup')]")).click();

		// Get Current Window Handle in 'parent' String
		String parent = driver.getWindowHandle();

		// Get all window handles in list s
		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		// Iterate until last windowhandle
		while (I1.hasNext()) {
			// Store next/child windowhandle in 'child_window' string
			String child_window = I1.next();

			//
			if (!parent.equals(child_window)) {
				// switched to child window
				driver.switchTo().window(child_window);
				// WebElement newtext = driver.findElement(By.tagName("p"));
				List<WebElement> newPopUp = driver.findElements(By.xpath("//p[starts-with(@id,'para')]"));
				// Created new string to get text and printed it 1-by-1
				String popup = "";
				System.out.println("New Popup Window Has Contents: " + popup);
				popup = " " + newPopUp.get(0).getText();
				System.out.println(popup);
				popup = " " + newPopUp.get(1).getText();
				System.out.println(popup);
				System.out.println();
				// System.out.println(newtext.getText());

				// closed current window
				driver.close();
			}

		}
		// switched to parent window
		driver.switchTo().window(parent);

		// Clicked on try it button
		WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
		actions.sendKeys(tryItButton, Keys.PAGE_DOWN).perform();
		actions.click(tryItButton).perform();
		
		// Double Clicked Using Actions 'Double Click Here' Button and Handled Alert
		WebElement dblClickHere= driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		actions.doubleClick(dblClickHere).perform();
		driver.switchTo().alert().accept();

		// Used Actions to click 'Check This' Button
		WebElement checkThisButton = driver.findElement(By.xpath("//button[text()='Check this']"));
		actions.click(checkThisButton).perform();

		// Waited for Checkbox 'Mr Option' to be clickable and then clicked it
		WebElement mrOptionCheckBox = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
		
		if (!mrOptionCheckBox.isSelected()) {
			actions.click(mrOptionCheckBox).perform();
		}

		// Selected Gender
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='male']"));
		actions.click(maleRadio).perform();

		// Clicked 'ClickToGetAlert' Button and Handled Alert
		WebElement clickToGetAlert = driver.findElement(By.xpath("//input[@value='ClickToGetAlert']"));
		actions.click(clickToGetAlert).perform();
		driver.switchTo().alert().accept();

		// Unchecked Orange Checkbox
		WebElement orangeCheckBox = driver.findElement(By.xpath("//input[@value='orange']"));
		if (orangeCheckBox.isSelected()) {
			actions.click(orangeCheckBox).perform();
		}

		// Checked Blue Checkbox
		WebElement blueCheckBox= driver.findElement(By.xpath("//input[@value='blue']"));
		if (!blueCheckBox.isSelected()) {
			actions.click(blueCheckBox).perform();
		}

		// Read 'ReadThisText' from text box and printed it
		WebElement readThisText = driver.findElement(By.xpath("//input[@id='rotb']"));
		System.out.println("Textbox Has Contents: " + readThisText.getAttribute("value"));
		System.out.println();

		// Clicked on 'Get Prompt' Button and handled alert
		WebElement getPrompt= driver.findElement(By.xpath("//input[@id='prompt']"));
		actions.click(getPrompt).perform();
		driver.switchTo().alert().sendKeys("Foxi it iz");
		driver.switchTo().alert().accept();

		// Clicked 'Get Confirmation' Button and Handled Alert
		WebElement getConfirmation = driver.findElement(By.xpath("//input[@id='confirm']"));
		actions.click(getConfirmation).build().perform();
		driver.switchTo().alert().accept();

		// Filled text boxes below
		driver.findElement(By.xpath("//input[@name='textboxn']")).sendKeys("Dummy Text");

		driver.findElement(By.xpath(
				"//h2[text()='Locate using class']//following-sibling::div//input"))
				.sendKeys("Dummy Data 1");
		driver.findElement(By.xpath(
				"//h2[text()='element having same class name of above field']//following-sibling::div//input"))
				.sendKeys("Dummy Data 2");
		
		// Clicked Car Radio Button
		WebElement car = driver.findElement(By.xpath("//input[@value='Car']"));
		actions.click(car).perform();

		// Clicked Book Checkbox
		WebElement book = driver.findElement(By.xpath("//input[@value='Book']"));
		if (book.isSelected()) {
			actions.click(book).perform();
		}

		// Clicked Laptop Checkbox
		WebElement laptop = driver.findElement(By.xpath("//input[@value='Laptop']"));
		if (!laptop.isSelected()) {
			actions.click(laptop).perform();
		}

		// Clicked Bag Checkbox
		WebElement bag = driver.findElement(By.xpath("//input[@value='Bag']"));
		if (!bag.isSelected()) {
			actions.click(bag).perform();
		}

		// Clicked 'Drop' Button
		WebElement dropDownButton = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		actions.click(dropDownButton).perform();

		// Waited for drop down element to appear and clicked gmail
		WebElement gmailLink = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://gmail.com/']")));
		actions.click(gmailLink).perform();

		// ...END...

		Thread.sleep(2000);
		driver.quit();

	}

}
