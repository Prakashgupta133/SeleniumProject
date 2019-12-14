package testNG1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop1 {
	WebDriver driver;
	@Test
	public void testDragnDrop() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(4000);
		assertEquals("Droppable | jQuery UI",driver.getTitle());
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(4000);
	}
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
