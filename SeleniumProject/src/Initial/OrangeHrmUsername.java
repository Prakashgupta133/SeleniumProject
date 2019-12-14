package Initial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmUsername {

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
				driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
				List <WebElement> tabs=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
				
				System.out.println(tabs.size());
				
				for(int i=1;i<=tabs.size();i++)
				{
					//System.out.println("Inside for loop");
					Thread.sleep(1000);
				System.out.println(driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[2]")).getText());
				}
				
				System.out.println("After for loop");
				driver.close();
	}
}