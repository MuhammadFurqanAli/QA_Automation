import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.Thread;

public class 4123_QA_Automation {
	public static void main(String[] args) throws InterruptedException{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         
         String baseurl="https://www.way2automation.com/";
         driver.get(baseurl);
         
         
         driver.findElement(By.linkText("All Courses")).click();

         driver.findElement(By.linkText("Selenium")).click();

         driver.findElement(By.linkText("Selenium with Java")).click();
         
         
         Thread.sleep(3000);
         String baseurl0="https://sso.teachable.com/secure/673/identity/login";
         driver.get(baseurl0);
         
         driver.findElement(By.linkText("Sign Up")).click();
         
         Thread.sleep(3000);
  	     
         driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("MFA");
         driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("MFA123@gmail.com");
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mfa.123");
         driver.findElement(By.xpath("//input[@name='commit']")).click();

         Thread.sleep(3000);
         
         String baseurl1="https://www.way2automation.com/way2auto_jquery/frames-and-windows.php";
         driver.get(baseurl1);
         
         Thread.sleep(1000);
         
         String winHan = driver.getWindowHandle();
         driver.switchTo().frame(0);
         driver.findElement(By.linkText("New Browser Tab")).click();
         Thread.sleep(3000);
         
         
         driver.switchTo().window(winHan);
         Thread.sleep(1000);
         driver.findElement(By.linkText("Frames and Windows")).click();
         Thread.sleep(3000);
         //driver.switchTo().parentFrame();
         driver.findElement(By.linkText("Open Seprate New Window")).click();
         driver.switchTo().frame(0);
         driver.findElement(By.linkText("Open New Seprate Window")).click();
         Thread.sleep(3000);
         
         
         /*
         driver.switchTo().window(winHan);
         Thread.sleep(1000);
         driver.switchTo().defaultContent();
         driver.findElement(By.linkText("Frameset")).click();
         driver.switchTo().frame(0);
         driver.findElement(By.linkText("Open Frameset Window")).click();
         Thread.sleep(3000);
         
         
         driver.switchTo().window(winHan);
         Thread.sleep(1000);
         driver.switchTo().defaultContent();
         driver.findElement(By.linkText("Open Multiple Windows")).click();
         driver.switchTo().frame(0);
         driver.findElement(By.linkText("Open multiple pages")).click();
         Thread.sleep(3000);
         
         driver.switchTo().window(winHan);*/
         //Thread.sleep(5000);
         //driver.close();
         

	}

}
