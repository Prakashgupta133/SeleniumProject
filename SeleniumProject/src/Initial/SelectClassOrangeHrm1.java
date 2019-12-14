package Initial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassOrangeHrm1 {

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
				
				//PIM -> Job title
				driver.findElement(By.xpath("//b[text()='PIM']")).click();
				Thread.sleep(4000);	
				
				WebElement ele2=driver.findElement(By.id("empsearch_job_title"));
				Select jobTitle=new Select(ele2);
				List<WebElement> jt1 =jobTitle.getOptions();
				ArrayList<String> list2 = new ArrayList<String>();
				for(WebElement e1: jt1)
				{
					list2.add(e1.getText());
				}
				for (String li : list2) {

					System.out.println(li);
				}
				System.out.println(jobTitle.isMultiple());
				jobTitle.selectByVisibleText("CEO");
				Thread.sleep(3000);
				jobTitle.selectByValue("5");
				Thread.sleep(3000);
				jobTitle.selectByIndex(8);
				Thread.sleep(3000);
				driver.close();

	}

}
