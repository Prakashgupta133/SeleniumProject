package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Tasks1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
				  
				  WebDriver driver =new ChromeDriver();  

				driver.manage().window().maximize();
				driver.get("http://localhost/login.do");
				Thread.sleep(6000);	
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				driver.findElement(By.xpath("//a[@id='loginButton']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@class='content tasks']")).click();
				
				int row=driver.findElements(By.xpath("//table[@class='taskRowsTable']/tbody/tr")).size();
				JavascriptExecutor scr = (JavascriptExecutor) driver;
				System.out.println(row);
			for(int i=1;i<=row;i++)
				{
					for(int y=200;y<=600;y+=400) {
					Thread.sleep(4000);
					scr.executeScript("window.scroll(0,"+ y+ ")");
					}
					System.out.println(driver.findElement(By.xpath("//table[@class='taskRowsTable']/tbody/tr["+i+"]/td[2]/div/div[2]")).getText());
				}
				driver.close();
	}

}
