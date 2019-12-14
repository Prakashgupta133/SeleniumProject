package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
				  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
				  
				  WebDriver driver =new ChromeDriver();  
				
				/*
				 * System.setProperty("webdriver.gecko.driver",
				 * "C:\\Users\\praka\\Downloads\\geckodriver-v0.25.0-win32\\geckodriver.exe");
				 * 
				 * WebDriver driver =new FirefoxDriver();
				 */ 
				driver.manage().window().maximize();
				driver.get("file:///D:/Software/Selenium_Student_SW/Selenium_Student_SW/HtmlFiles/WebTable.html");
				Thread.sleep(4000);	
				
				int rows=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
				int columns=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
				Thread.sleep(2000);
				
				for(int i=1;i<=rows;i++)
				{
					for(int j=1;j<=columns;j++)
					{
						WebElement table1=(driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]/td["+j+"]")));
						System.out.print("  "+String.format("%-15s", table1.getText())+"  ");
					}
					System.out.println();
				}

	}

}
