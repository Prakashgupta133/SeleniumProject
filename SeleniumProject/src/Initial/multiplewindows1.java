package Initial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///D:/Software/Selenium_Student_SW/Selenium_Student_SW/HtmlFiles/multiplewindows.html");
		Thread.sleep(4000);
		int windows1 = driver.findElements(By.xpath("//div[@class='windows group']/button")).size();

		Thread.sleep(1000);
		String mainpage = driver.getWindowHandle();
		/*for(String s: mainpage) {
			System.out.println(s);
			if (!s.equals(mainpage)) {
				driver.switchTo().window(s);
			}
		}*/
		for (int i = 1; i <= windows1; i++) {
			
			driver.findElement(By.xpath("//div[@class='windows group']/button[" + i + "]")).click();
			Thread.sleep(3000);
			Set<String> windows = driver.getWindowHandles();
			for (String s : windows) {
				if (!s.equals(mainpage)) {
					driver.switchTo().window(s);
					driver.close();
				}
			}
			driver.switchTo().window(mainpage);
			/*if (!s1.equals(mainpage)) {
				System.out.println("If1....");
				System.out.println(driver.findElement(By.xpath("//div[@class='windows group']/button[" + i + "]")).getText());
				System.out.println("If2....");
				driver.close();*/
			}
	driver.close();	

	}
}

