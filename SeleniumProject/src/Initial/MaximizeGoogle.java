package Initial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver =new ChromeDriver();   
		
		driver.get("https://google.co.in/");
		Thread.sleep(2000);	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
