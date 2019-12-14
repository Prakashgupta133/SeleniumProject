package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperClass {

	public WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

	}

	public void loginOrangeHrm() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

	public void logoutOrangeHrm() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();

	}

	public void adminUser() throws InterruptedException {
		Thread.sleep(4000);
		WebElement ele1 = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).click().perform();

	}
}
