package Initial;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("webdriver");
		searchBox.submit();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		ArrayList<String> arrayOfLinks = new ArrayList<String>();

		for (WebElement lin : links) {
			arrayOfLinks.add(lin.getAttribute("href"));

		}

		for (String str : arrayOfLinks) {

			Thread.sleep(1000);

			if (str == null)
				continue;
			else

				driver.navigate().to(str);
		}

	}

}
