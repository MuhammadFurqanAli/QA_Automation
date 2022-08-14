import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.Thread;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Lab5{
	public static void main(String[] args) throws InterruptedException{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\CureMD\\QA_Automation\\Java\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         String baseurl=" https://omayo.blogspot.in/";
         driver.get(baseurl);
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         
         driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Hello!!! Let's start this beautiful journey.");
         WebElement ta2 = driver.findElement(By.xpath("//div[@id='HTML11']//following::textarea"));
         js.executeScript("arguments[0].scrollIntoView();", ta2);
         System.out.println();
         
         System.out.println("Text Area 2 has Text: " + ta2.getText());
         System.out.println();
         ta2.clear();
         ta2.sendKeys("I am an Electrical Engineer ;)");
         
         int j=0;
         String t1h1="",t1r1="",t1r2="",t1r3="",t1r4="";
         
         for(j=1;j<=3;j++) {
        	 t1h1 += " " + driver.findElement(By.xpath(
           		  "//table[@id='table1']//child::th["+j+"]")).getText();
         }
         
         for(j=1;j<=3;j++) {
        	 t1r1 += " " + driver.findElement(By.xpath(
           		  "//table[@id='table1']//child::tr[1]//child::td["+j+"]")).getText();
         }

         for(j=1;j<=3;j++) {
        	 t1r2 += " " + driver.findElement(By.xpath(
           		  "//table[@id='table1']//child::tr[2]//child::td["+j+"]")).getText();
         }

         for(j=1;j<=3;j++) {
        	 t1r3 += " " + driver.findElement(By.xpath(
           		  "//table[@id='table1']//child::tr[3]//child::td["+j+"]")).getText();
         }

         for(j=1;j<=3;j++) {
        	 t1r4 += " " + driver.findElement(By.xpath(
           		  "//table[@id='table1']//child::tr[4]//child::td["+j+"]")).getText();
         }
         
         WebElement tab1 = driver.findElement(By.xpath("//table[@id='table1']//child::th[2]"));
         js.executeScript("arguments[0].scrollIntoView();", tab1);
        
         System.out.println("Table Has Following Contents: ");
         System.out.println(t1h1);
         System.out.println(t1r1);
         System.out.println(t1r2);
         System.out.println(t1r3);
         System.out.println(t1r4);
         System.out.println();
         
         Actions actions = new Actions(driver);
         WebElement elementLocator = driver.findElement(By.xpath("//button[@value='LogIn']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         driver.findElement(By.xpath("//form[@name='form1']//child::input[@type='text']")).sendKeys("Foxi");
         driver.findElement(By.xpath("//form[@name='form1']//child::input[@type='password']")).sendKeys("beep");
         //driver.findElement(By.xpath("//button[@value='LogIn']")).click();
         actions.click(elementLocator).perform();
         
         
         WebElement a = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
         driver.switchTo().frame(a);
         //js.executeScript("arguments[0].scrollIntoView();", a);
         
         driver.switchTo().parentFrame();
         WebElement b = driver.findElement(By.xpath("//iframe[@id='iframe2']"));
         driver.switchTo().frame(b);
         //js.executeScript("arguments[0].scrollIntoView();", b);
         
         driver.switchTo().parentFrame();
         elementLocator = driver.findElement(By.xpath("//input[@value='Login']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Foxi it iz");
         driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("beepboop");
         //driver.findElement(By.xpath("//input[@value='Login']")).click();
         actions.click(elementLocator).perform();
         driver.switchTo().alert().accept();
         
         elementLocator = driver.findElement(By.xpath("//option[@value='Hyundaix']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//option[@value='Hyundaix']")).click();
         
         elementLocator = driver.findElement(By.xpath("//select[@id='drop1']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.clickAndHold(elementLocator).perform();
         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement element1 = wait1.until(ExpectedConditions.
        		 visibilityOfElementLocated(By.xpath("//select[@id='drop1']//option[@id='ironman4']")));
         elementLocator = driver.findElement(By.xpath("//select[@id='drop1']//option[@id='ironman4']"));
         //actions.moveToElement(elementLocator).click().perform();
         
         driver.findElement(By.xpath("//select[@id='drop1']//option[@id='ironman4']")).click();
         
         WebElement tb1 = driver.findElement(By.xpath("//input[@id='textbox1']"));
         js.executeScript("arguments[0].scrollIntoView();", tb1);
         tb1.clear();
         tb1.sendKeys("hello world");
         
         elementLocator = driver.findElement(By.xpath("//button[@id='but2']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//button[@id='but2']")).click();
         
         elementLocator = driver.findElement(By.xpath("//button[text()='Submit']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//button[text()='Submit']")).click();
         elementLocator = driver.findElement(By.xpath("//button[text()='Login']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//button[text()='Login']")).click();
         elementLocator = driver.findElement(By.xpath("//button[text()='Register']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//button[text()='Register']")).click();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='alert2']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//input[@id='alert2']")).click();
         driver.switchTo().alert().accept();
         
         //String winHan = driver.getWindowHandle();
         //driver.switchTo().window(winHan);
         
         driver.findElement(By.xpath("//a[starts-with(@href,'JavaScript:newPopup')]")).click();
         
         String parent=driver.getWindowHandle();

         Set<String>s=driver.getWindowHandles();

         // Now iterate using Iterator
         Iterator<String> I1= s.iterator();

         while(I1.hasNext())
         {

        	 String child_window=I1.next();


        	 if(!parent.equals(child_window))
        	 {
        		 driver.switchTo().window(child_window);
        		 //WebElement newtext = driver.findElement(By.tagName("p"));
        		 String popup = "";
        		 System.out.println("New Popup Window Has Contents: "+popup);
        		 popup = " " + driver.findElement(By.xpath("//p[@id='para1']")).getText();
        		 System.out.println(popup);
        		 popup = " " + driver.findElement(By.xpath("//p[@id='para2']")).getText();
        		 System.out.println(popup);
        		 System.out.println();
         		 //System.out.println(newtext.getText());

         		 driver.close();
         	}

         }
         //switch to the parent window
         driver.switchTo().window(parent);

         /*Thread.sleep(3000);
         String newWinHan = driver.getWindowHandle();
         driver.switchTo().window(newWinHan);
         driver.manage().window().maximize();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.titleIs("Basic Web Page Title"));
         
         //WebElement newtext = driver.findElement(By.xpath("//p[@id='para1']"));
         
         String popup ="";
         //Thread.sleep(2000);
         
         
         //WebElement e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='para1']")));         
                  
         
         //A paragraph of text
         //popup += " " + driver.findElement(By.tagName("p")).getAttribute("p");
         
         //popup = " " + driver.findElement(By.xpath("//p[@id='para1']")).getText();
         //popup = " " + driver.findElement(By.xpath("//p[@id='para2']")).getText();
         System.out.println("New Popup Window Has Contents: "+popup);
         System.out.println();
         //Thread.sleep(2000);
         //driver.close();
         driver.switchTo().parentFrame();
         */
         
         elementLocator = driver.findElement(By.xpath("//button[text()='Try it']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//button[text()='Try it']")).click();
         
         elementLocator = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.doubleClick(elementLocator).perform();
         driver.switchTo().alert().accept();
         
         elementLocator = driver.findElement(By.xpath("//button[text()='Check this']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='dte']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         element1 = wait1.until(ExpectedConditions.
        		 elementToBeClickable(By.xpath("//input[@id='dte']")));
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='radio1']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         element1 = wait1.until(ExpectedConditions.
        		 elementToBeClickable(By.xpath("//input[@id='radio1']")));
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='alert1']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         //driver.findElement(By.xpath("//input[@id='alert1']")).click();
         driver.switchTo().alert().accept();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='checkbox1']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='checkbox2']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         ta2 = driver.findElement(By.xpath("//input[@id='rotb']"));
         js.executeScript("arguments[0].scrollIntoView();", ta2);
         System.out.println("Textbox Has Contents: "+ta2.getAttribute("value"));
         System.out.println();
         
         
         elementLocator = driver.findElement(By.xpath("//input[@id='prompt']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         driver.switchTo().alert().sendKeys("Foxi it iz");
         driver.switchTo().alert().accept();
         
         elementLocator = driver.findElement(By.xpath("//input[@id='confirm']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         driver.switchTo().alert().accept();
         
         driver.findElement(By.xpath("//input[@name='textboxn']")).sendKeys("Dummy Text");
         
         driver.findElement(By.xpath("//div[@id='HTML24']//input[@class='classone']")).sendKeys("Dummy Data 1");
         driver.findElement(By.xpath("//div[@id='HTML28']//input[@class='classone']")).sendKeys("Dummy Data 2");
       
         elementLocator = driver.findElement(By.xpath("//input[@value='Car']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@value='Book']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@value='Laptop']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//input[@value='Bag']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//button[@class='dropbtn']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         actions.click(elementLocator).perform();
         
         elementLocator = driver.findElement(By.xpath("//a[@href='http://gmail.com/']"));
         js.executeScript("arguments[0].scrollIntoView();", elementLocator);
         element1 = wait1.until(ExpectedConditions.
        		 visibilityOfElementLocated(By.xpath("//a[@href='http://gmail.com/']")));
         actions.click(elementLocator).perform();
         
         Thread.sleep(1000);
         //driver.quit();
         
	}

}
