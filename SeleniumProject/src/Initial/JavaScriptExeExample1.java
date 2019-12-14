package Initial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExeExample1 {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.linkText("View License")).click();
		
		String parentHandle=driver.getWindowHandle();
		
		Set <String> handles =driver.getWindowHandles();
		
		for(String s: handles)
		{
			if(!s.equals(parentHandle))
			{
				driver.switchTo().window(s);
			}
		}
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		for(int y=200;y<=5000;y+=200) {
			Thread.sleep(2000);
			jse.executeScript("window.scroll(0,"+ y+ ")");
			
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
