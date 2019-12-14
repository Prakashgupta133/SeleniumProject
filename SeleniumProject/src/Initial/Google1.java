package Initial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

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
		
		driver.get("https://google.co.in/");
		Thread.sleep(2000);	
		driver.close();
	}

}
