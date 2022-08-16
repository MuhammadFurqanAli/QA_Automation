import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.io.ObjectInputStream.GetField;
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

		// Defined JS Executor for Scrolling into view
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Created Actions Class Object
		Actions actions = new Actions(driver);
		
		// Step-1
		// 1-Entered Your Name in the first text field
		//driver.findElement(By.xpath("//textarea[starts-with(@id,'ta')]")).sendKeys("MUHAMMAD FURQAN ALI");
		// Located Second Text Box and Scrolled into view
		List<WebElement> ta = driver.findElements(By.xpath("//h2[text()='Text Area Field']//following::textarea"));
		
		actions.sendKeys(ta.get(0), Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", ta2);

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
		//actions.sendKeys(upload, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", ta2);
		//driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\4123\\Desktop\\QA Automation\\eclipse-workspace\\TEST_0\\src\\Lab5.java");

		// Step-2
		//
		WebElement tab1 = driver.findElement(By.xpath("//table[contains(@id,'table')]"));
		actions.sendKeys(tab1, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", tab1);
		String t1 = "";
		List<WebElement> t1el = driver.findElements(By.xpath("//table[contains(@id,'table')]"));

		for (WebElement ele : t1el) {
			t1 = ele.getText();
			System.out.println("Table Has Following Contents: " + t1);
		}

		/*
		 //Defined variable for loops and initialized strings int j=0; String
		 t1h1="",t1r1="",t1r2="",t1r3="",t1r4=""; //Got table data 1-by-1 using
		 xpath's for(j=1;j<=3;j++) { t1h1 += " " + driver.findElement(By.xpath(
		 "//table[@id='table1']//child::th["+j+"]")).getText(); }
		 
		 for(j=1;j<=3;j++) { t1r1 += " " + driver.findElement(By.xpath(
		 "//table[@id='table1']//child::tr[1]//child::td["+j+"]")).getText(); }
		 
		 for(j=1;j<=3;j++) { t1r2 += " " + driver.findElement(By.xpath(
		 "//table[@id='table1']//child::tr[2]//child::td["+j+"]")).getText(); }
		 
		 for(j=1;j<=3;j++) { t1r3 += " " + driver.findElement(By.xpath(
		 "//table[@id='table1']//child::tr[3]//child::td["+j+"]")).getText(); }
		 
		 for(j=1;j<=3;j++) { t1r4 += " " + driver.findElement(By.xpath(
		 "//table[@id='table1']//child::tr[4]//child::td["+j+"]")).getText(); }
		 
		 //Scrolled into view WebElement tab1 =
		 driver.findElement(By.xpath("//table[@id='table1']//child::th[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", tab1); //Printed Table
		 Data System.out.println("Table Has Following Contents: ");
		 System.out.println(t1h1); System.out.println(t1r1); System.out.println(t1r2);
		 System.out.println(t1r3); System.out.println(t1r4); System.out.println();
		 */
		
		

		// Entered Username and Password, then hit login button
		WebElement elementLocator = driver.findElement(By.xpath("//button[@value='LogIn']"));
		actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		driver.findElement(By.xpath("//form[starts-with(@name,'form')]//input[@type='text']")).sendKeys("Foxi");
		driver.findElement(By.xpath("//form[starts-with(@name,'form')]//input[@type='password']")).sendKeys("beep");
		// driver.findElement(By.xpath("//button[@value='LogIn']")).click();
		actions.click(elementLocator).perform();

		// Step-3
		// Found Frame-1 Using xpath and moved to it
		List<WebElement> frame = driver.findElements(By.xpath("//iframe[contains(@id,'iframe')]"));
		// actions.moveToElement(a,50,50).perform();
		driver.switchTo().frame(frame.get(1));
		// js.executeScript("arguments[0].scrollIntoView();", a);
		// Thread.sleep(2000);
		// Back to Parent Frame, Then Found Frame-2 Using xpath and moved to it
		driver.switchTo().parentFrame();
		// actions.moveToElement(b,50,50).perform();
		driver.switchTo().frame(frame.get(2));
		// js.executeScript("arguments[0].scrollIntoView();", b);
		// Thread.sleep(2000);
		// Back to Parent Frame
		driver.switchTo().parentFrame();

		// Found UserName and Password, then Scrolled into view
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);

		// Entered Username and Password
		elementLocator = driver.findElement(By.xpath("//input[@name='userid']"));
		actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Foxi it iz");
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("beepboop");
		// driver.findElement(By.xpath("//input[@value='Login']")).click();

		// Clicked login button using actions class and handled/accepted alert
		elementLocator = driver.findElement(By.xpath("//input[@value='Login']"));
		actions.click(elementLocator).perform();
		driver.switchTo().alert().accept();

		// Step-4
		// Found Element of multiple selection box and moved to it, then clicked it
		elementLocator = driver.findElement(By.xpath("//option[@value='Hyundaix']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//option[@value='Hyundaix']")).click();

		// Found Element of multiple selection box, then clicked & hold it
		// Waited for doc3 option and clicked it
		elementLocator = driver.findElement(By.xpath("//select[starts-with(@id,'drop')]"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.clickAndHold(elementLocator).perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[starts-with(@id,'drop')]//option[@value='jkl']")));
		// elementLocator =
		// driver.findElement(By.xpath("//select[@id='drop1']//option[@id='ironman4']"));
		// actions.moveToElement(elementLocator).click().perform();
		driver.findElement(By.xpath("//select[starts-with(@id,'drop')]//option[@value='jkl']")).click();

		// Cleared Pre-loaded Textbox and entered hello world
		WebElement tb1 = driver.findElement(By.xpath("//input[starts-with(@id,'textbox')]"));
		actions.sendKeys(tb1, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", tb1);
		tb1.clear();
		tb1.sendKeys("hello world");

		// Clicked on Enabled Button/Button2
		elementLocator = driver.findElement(By.xpath("//button[text()='Button2']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//button[@id='but2']")).click();

		// Clicked on All three buttons

		// Submit
		elementLocator = driver.findElement(By.xpath("//button[text()='Submit']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Login
		elementLocator = driver.findElement(By.xpath("//button[text()='Login']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//button[text()='Login']")).click();

		// Register
		elementLocator = driver.findElement(By.xpath("//button[text()='Register']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//button[text()='Register']")).click();

		// Clicked 'ClickAfterTextDisappears' Button
		// Handled Alert
		elementLocator = driver.findElement(By.xpath("//input[@value='ClickAfterTextDissappears']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//input[@id='alert2']")).click();
		driver.switchTo().alert().accept();

		// String winHan = driver.getWindowHandle();
		// driver.switchTo().window(winHan);

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

		// Old code
		/*
		  Thread.sleep(3000); String newWinHan = driver.getWindowHandle();
		  driver.switchTo().window(newWinHan); driver.manage().window().maximize();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.titleIs("Basic Web Page Title"));
		  
		  //WebElement newtext = driver.findElement(By.xpath("//p[@id='para1']"));
		  
		  String popup =""; //Thread.sleep(2000);
		  
		  
		  //WebElement e1 =
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		  "//p[@id='para1']")));
		  
		  
		  //A paragraph of text //popup += " " +
		  driver.findElement(By.tagName("p")).getAttribute("p");
		  
		  //popup = " " + driver.findElement(By.xpath("//p[@id='para1']")).getText();
		  //popup = " " + driver.findElement(By.xpath("//p[@id='para2']")).getText();
		  System.out.println("New Popup Window Has Contents: "+popup);
		  System.out.println(); //Thread.sleep(2000); //driver.close();
		  driver.switchTo().parentFrame();
		 */

		// Clicked on try it button
		elementLocator = driver.findElement(By.xpath("//button[text()='Try it']"));
		actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Double Clicked Using Actions 'Double Click Here' Button and Handled Alert
		elementLocator = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.doubleClick(elementLocator).perform();
		driver.switchTo().alert().accept();

		// Used Actions to click 'Check This' Button
		elementLocator = driver.findElement(By.xpath("//button[text()='Check this']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();

		// Waited for Checkbox 'Mr Option' to be clickable and then clicked it
		elementLocator = driver.findElement(By.xpath("//input[@id='dte']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
		if (!elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Selected Gender
		elementLocator = driver.findElement(By.xpath("//input[@value='male']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();

		// Clicked 'ClickToGetAlert' Button and Handled Alert
		elementLocator = driver.findElement(By.xpath("//input[@value='ClickToGetAlert']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		// driver.findElement(By.xpath("//input[@id='alert1']")).click();
		driver.switchTo().alert().accept();

		// Unchecked Orange Checkbox
		elementLocator = driver.findElement(By.xpath("//input[@value='orange']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		if (elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Checked Blue Checkbox
		elementLocator = driver.findElement(By.xpath("//input[@value='blue']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		if (!elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Read 'ReadThisText' from text box and printed it
		elementLocator = driver.findElement(By.xpath("//input[@id='rotb']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", ta2);
		System.out.println("Textbox Has Contents: " + elementLocator.getAttribute("value"));
		System.out.println();

		// Clicked on 'Get Prompt' Button and handled alert
		elementLocator = driver.findElement(By.xpath("//input[@id='prompt']"));
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();
		driver.switchTo().alert().sendKeys("Foxi it iz");
		driver.switchTo().alert().accept();

		// Clicked 'Get Confirmation' Button and Handled Alert
		elementLocator = driver.findElement(By.xpath("//input[@id='confirm']"));
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).build().perform();
		driver.switchTo().alert().accept();

		// Filled text boxes below
		driver.findElement(By.xpath("//input[@name='textboxn']")).sendKeys("Dummy Text");

		// h2[text()='element having same class name of above
		// field']//following-sibling::div[@class='widget-content']//child::input
		driver.findElement(By.xpath(
				"//h2[text()='Locate using class']//following-sibling::div//input"))
				.sendKeys("Dummy Data 1");
		driver.findElement(By.xpath(
				"//h2[text()='element having same class name of above field']//following-sibling::div//input"))
				.sendKeys("Dummy Data 2");
		// driver.findElement(By.xpath("//div[@id='HTML24']//input[@class='classone']")).sendKeys("Dummy
		// Data 1");
		// driver.findElement(By.xpath("//div[@id='HTML28']//input[@class='classone']")).sendKeys("Dummy
		// Data 2");

		// Clicked Car Radio Button
		elementLocator = driver.findElement(By.xpath("//input[@value='Car']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();

		// Clicked Book Checkbox
		elementLocator = driver.findElement(By.xpath("//input[@value='Book']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		if (elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Clicked Laptop Checkbox
		elementLocator = driver.findElement(By.xpath("//input[@value='Laptop']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		if (!elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Clicked Bag Checkbox
		elementLocator = driver.findElement(By.xpath("//input[@value='Bag']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		if (!elementLocator.isSelected()) {
			actions.click(elementLocator).perform();
		}

		// Clicked 'Drop' Button
		elementLocator = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		actions.click(elementLocator).perform();

		// Waited for drop down element to appear and clicked gmail
		elementLocator = driver.findElement(By.xpath("//a[@href='http://gmail.com/']"));
		//actions.sendKeys(elementLocator, Keys.PAGE_DOWN).perform();
		//js.executeScript("arguments[0].scrollIntoView();", elementLocator);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='http://gmail.com/']")));
		actions.click(elementLocator).perform();

		// ...END...

		Thread.sleep(5000);
		driver.quit();

	}

}
