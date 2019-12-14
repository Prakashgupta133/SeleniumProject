package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario26 {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");


	 /* 3.	scroll upto some axis
	  4.	check whether top icon  is displayed or not
	  5.	if it displayed click on it
	  */
		
		
	  driver.close();
	  
	  
  }
}
