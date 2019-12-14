package Initial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///D:/Software/Selenium_Student_SW/Selenium_Student_SW/HtmlFiles/multiplewindows.html");
		Thread.sleep(2000);
		int windows1 = driver.findElements(By.xpath("//div[@class='windows group']/button")).size();

		Thread.sleep(1000);
		
		for (int i = 1; i <= windows1; i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='windows group']/button[" + i + "]")).click();
			Thread.sleep(1000);
		}
			String parentWindow=driver.getWindowHandle();
			
			Set<String> windows = driver.getWindowHandles();
			for(String window: windows) {
				System.out.println(window);
			}
			
			List <String> listWindows=new ArrayList(windows);
			
			System.out.println("***********");
		for(int i=1;i<windows.size();i++)
		{
			
			System.out.println(listWindows.get(i));
		    driver.switchTo().window(listWindows.get(i));
		   Thread.sleep(1000);
		   driver.close();
		}
		
		driver.switchTo().window(parentWindow);
			
		driver.close();
		
		
		
		

}
}