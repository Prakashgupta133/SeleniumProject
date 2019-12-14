package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8012/orangehrm/index.php");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//title")).getAttribute("textContent"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String titlebyJavascript=(String) jse.executeScript("return document.title");
		System.out.println("Title by javascript Executor: "+titlebyJavascript);
		driver.close();

	}

}
