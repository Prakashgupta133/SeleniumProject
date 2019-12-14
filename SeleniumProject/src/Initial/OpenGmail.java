package Initial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmail {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.co.in/");
		Thread.sleep(2000);
		
		// Open Gmail
		driver.findElement(By.cssSelector("#gbw>div>div>div>div>a")).click();
		
		driver.close();
	}

}
