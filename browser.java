import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
	public class browser{
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\4123\\Downloads\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("http://www.google.com");
	}
}