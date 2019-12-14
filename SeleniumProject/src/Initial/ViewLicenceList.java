package Initial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLicenceList {

	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");

		driver.findElement(By.linkText("View License")).click();

		String parentHandle = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String s : handles) {
			if (!s.equals(parentHandle)) {
				driver.switchTo().window(s);
			}
		}

		List<WebElement> ul = driver.findElements(By.xpath("//div[@class='licenseText no_restrictions_para']/h2"));

		ArrayList<String> list = new ArrayList<String>();

		for (WebElement ele : ul) {
			list.add(ele.getText());
		}

		for (String def : list) {

			System.out.println(def);
		}
		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * 
		 * for(int y=200;y<=5000;y+=200) { Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * jse.executeScript("window.scroll(0,"+ y+ ")");
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		Thread.sleep(1000);
		driver.quit();

	}

}
