package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelEx2 {
	WebDriver driver;
	@Test
	public void openChrome() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Opened orange hrm in Chrome");
		Thread.sleep(2000);
	}
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");	
			driver=new ChromeDriver();
		}

}
	@AfterTest
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
