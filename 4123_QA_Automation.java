import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.Thread;
import java.time.Duration;

public class Demo{
	public static void main(String[] args) throws InterruptedException{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         /*
         String baseurl="https://www.way2automation.com/";
         driver.get(baseurl);
         Actions builder = new Actions(driver);
         
         
         WebElement ac= driver.findElement(By.linkText("All Courses"));
         builder.clickAndHold(ac).build().perform();
         
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
         WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-27582']")));
         
         WebElement sub_ac= driver.findElement(By.linkText("Selenium"));
         builder.clickAndHold(sub_ac).build().perform();

         WebElement sub_ac0= driver.findElement(By.linkText("Selenium with Java"));
         builder.click(sub_ac0).build().perform();
         
         Thread.sleep(3000);
         
         
         //Task-3
         
         String baseurl0="https://sso.teachable.com/secure/673/identity/login";
         driver.get(baseurl0);
         
         driver.findElement(By.linkText("Sign Up")).click();
         
         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
         WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_name']")));
  	     
         driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("MFA");
         driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("MFA123@gmail.com");
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mfa.123");
         driver.findElement(By.xpath("//input[(@id='allow_marketing_emails')and(@type='checkbox')]")).click();
         driver.findElement(By.xpath("//input[@name='commit']")).click();

         Thread.sleep(3000);
         
         */
         //Task-2
         
         String baseurl1="https://www.way2automation.com/way2auto_jquery/frames-and-windows.php";
         driver.get(baseurl1);
         
         String winHan = driver.getWindowHandle();
         
         WebElement a = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult1.html\"]"));
         Thread.sleep(1000);
         driver.switchTo().frame(a);
         driver.findElement(By.linkText("New Browser Tab")).click();
         //String nbt = driver.getWindowHandle();
         Thread.sleep(2000);
         //driver.quit();
         
         driver.switchTo().window(winHan);
         driver.findElement(By.xpath("//a[@href='#example-1-tab-2']")).click();
         WebElement b = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult2.html\"]"));
         Thread.sleep(1000);
         driver.switchTo().frame(b);
         driver.findElement(By.linkText("Open New Seprate Window")).click();
         Thread.sleep(2000);
         
         
         
         driver.switchTo().window(winHan);
         driver.findElement(By.xpath("//a[@href='#example-1-tab-3']")).click();
         //driver.close();
         WebElement c = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult3.html\"]"));
         Thread.sleep(1000);
         driver.switchTo().frame(c);
         driver.findElement(By.linkText("Open Frameset Window")).click();
         Thread.sleep(2000);
         
         
         driver.switchTo().window(winHan);
         driver.findElement(By.xpath("//a[@href='#example-1-tab-4']")).click();
         WebElement d = driver.findElement(By.xpath("//iframe[@src=\"frames-windows/defult4.html\"]"));
         Thread.sleep(1000);
         driver.switchTo().frame(d);
         driver.findElement(By.linkText("Open multiple pages")).click();
         Thread.sleep(2000);
         
         driver.switchTo().window(winHan);
         Thread.sleep(1000);
         driver.findElement(By.linkText("Frames and Windows")).click();
         Thread.sleep(3000);
         driver.quit();
	}

}
