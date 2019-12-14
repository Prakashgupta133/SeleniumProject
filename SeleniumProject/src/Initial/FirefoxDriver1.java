package Initial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	//	WebDriver driver1=new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/geckodriver-selenium-tutorial/");
		
	

	}

}
