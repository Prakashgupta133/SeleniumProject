package testNG1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);

		// Get the list of Links

		Thread.sleep(1000);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count = 0;

		for (WebElement link : links) {
			String href = link.getAttribute("href");

			try {
				if (href != null) {
					URL url = new URL(href);
					HttpURLConnection connection = (HttpURLConnection) (url.openConnection());
					int response = connection.getResponseCode();
					if (response == 200) {
						
						 System.out.println(++count + ". " + response + " ");
						 System.out.println(connection.getResponseMessage());
						 System.out.println("Link is Active");
						
					} else

					{
						System.out.println(++count + ".  " + response);
						System.out.println(connection.getResponseMessage());
						System.out.println("Link is Broken");

					}
				}
			} catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
		}
	}
}
