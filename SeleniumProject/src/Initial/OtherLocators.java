package Initial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		List <WebElement> list1 = driver.findElements(By.tagName("input"));
		for(WebElement el:list1) {
			System.out.println(" : "+el.getTagName());
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.linkText("Forgot your password?")).getText());
		System.out.println(driver.findElement(By.partialLinkText("Forgot")).getText());
		driver.close();
		
		

	}

}
