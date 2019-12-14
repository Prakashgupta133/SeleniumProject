package Initial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuListOrangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		List<WebElement> ul = driver.findElements(By.xpath("//div[@class='menu']/ul/li/a/b"));

		ArrayList<String> list = new ArrayList<String>();

		for (WebElement ele : ul) {
			list.add(ele.getText());
		}

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='menu']/ul/li/a/b[text()='" + list.get(i) + "']")).click();
		}

		Thread.sleep(2000);
		driver.close();
	}
}