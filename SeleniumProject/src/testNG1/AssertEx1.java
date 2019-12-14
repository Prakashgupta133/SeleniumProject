package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx1 {
	@Test
	public void hardAssert() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2019 | BlueStone.com";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("After Hard Assert");
		driver.close();
	}
	@Test
	public void softAssert() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		String actualTitle1=driver.getTitle();
		String expectedTitle1="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2019 | BlueStone.com";
		SoftAssert sw=new SoftAssert();
		sw.assertEquals(actualTitle1, expectedTitle1);
		
		System.out.println("Soft asserT");
		sw.assertAll();
	}

}
