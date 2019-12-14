package Initial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCapabilityEx1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.25.0-win32\\geckodriver.exe");
		
		DesiredCapabilities caps=DesiredCapabilities.firefox();
		//caps.setVersion("69");
		caps.setPlatform(Platform.WINDOWS);
		URL urlHub=null;
		try {
			urlHub= new URL("http://192.168.137.1:5556/wd/hub");
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(urlHub,caps);
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
