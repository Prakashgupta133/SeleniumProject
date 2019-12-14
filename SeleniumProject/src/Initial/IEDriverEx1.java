package Initial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Software\\Selenium_Student_SW\\Selenium_Student_SW\\Drivers\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
	//	WebDriver driver= new FirefoxDriver();
	//	WebDriver driver1=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com/");
		driver.close();
		
	
	}

}
