package testNG1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTestNgEx1 {
	@Parameters({"browserType"})
	@Test
	public void mailTest(String browserType) throws MalformedURLException, InterruptedException{
		DesiredCapabilities dr=null;
	        if(browserType.equals("firefox")){
	        dr=DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			
			dr.setPlatform(Platform.WINDOWS);
		}
		else if(browserType.equals("chrome")) {
			dr=DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.137.1:4444/wd/hub"),dr);
		Thread.sleep(2000);
		driver.get("http://localhost:8012/orangehrm/login.php");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}

}
