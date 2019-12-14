package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeCssSelector {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
			  
			  WebDriver driver =new ChromeDriver();  
			
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);	
			
			driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.cssSelector("#divPassword>#txtPassword")).sendKeys("admin123");
			driver.findElement(By.cssSelector("#divLoginButton>#btnLogin")).click();
			Thread.sleep(2000);	
			driver.close();
}
}
