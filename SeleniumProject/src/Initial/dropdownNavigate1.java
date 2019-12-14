package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownNavigate1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///D:/Software/Selenium_Student_SW/Selenium_Student_SW/HtmlFiles/dropdownNavigate.html");
		Thread.sleep(4000);
		int item = driver.findElements(By.xpath("//select[@name='OptWeb']/option")).size();

		Thread.sleep(1000);
		for (int i = 1; i <= item; i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@name='OptWeb']")).click();
			driver.findElement(By.xpath("//select[@name='OptWeb']/option[" + i + "]")).click();
			driver.findElement(By.xpath("//input[@name='btnGo']")).click();
			Thread.sleep(5000);
			driver.navigate().back();
		}
driver.close();
	}

}
