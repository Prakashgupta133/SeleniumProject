package Initial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestList1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));

		ArrayList<String> list = new ArrayList<String>();

		for (WebElement ele : list1) {
			list.add(ele.getText());
		}

		for (String def : list) {

			System.out.println(def);
		}

	}

}
