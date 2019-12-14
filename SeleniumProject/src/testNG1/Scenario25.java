package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario25 {
	@Test
	public void Scenario25() {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.bluestone.com/");

		WebElement searchBox = driver.findElement(By.id("search_query_top_elastic_search"));
		searchBox.sendKeys("rings");
		searchBox.submit();

		WebElement element = driver.findElement(By.xpath("//section[@id='Gender-form']"));

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		String womanCount = driver.findElement(By.xpath("//form[@id='gender']/div/div[1]/span/span[2]")).getText();

		System.out.println(womanCount);

		driver.close();

	}
}
