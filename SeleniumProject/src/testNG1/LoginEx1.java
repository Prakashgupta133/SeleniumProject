package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginEx1 {
	public WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

	}

	@Parameters({ "username", "password" })
	@Test(priority = 1)
	public void loginOrange(String username, String password) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Test(priority = 2)
	public void title1() throws InterruptedException {
		System.out.println("Before getting Title");
		String titleMain = driver.getTitle();
		System.out.println(titleMain);
	}

	@Test(priority = 3)
	public void logoutOrange() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("welcome"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome"))).click();
		ele.click();
		// Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Logout']"));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))).click();

		ele2.click();
		driver.close();
	}

}
