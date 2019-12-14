package Initial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmEx2 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver",
				  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
				  
				  WebDriver driver =new ChromeDriver();  
				
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(2000);	
				
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				
				List <WebElement> tabs=driver.findElements(By.xpath("//div[@class='menu']/ul/li/a"));
				
		/*
		 * for(WebElement ele:tabs) { System.out.println(ele.getText()); }
		 */
				for(WebElement ele:tabs)
				{
					ele.click();
					Thread.sleep(2000);
				}

	}

}
