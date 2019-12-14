package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	public WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

	}
	@DataProvider
	public String[][] getData(){
		String data[][]=new String[4][2];
		data[0][0]="user1";
		data[0][1]="pwd1";
		data[1][0]="user2";
		data[1][1]="pwd2";
		data[2][0]="user3";
		data[2][1]="pwd3";
		data[3][0]="Admin";
		data[3][1]="admin123";
	return data;
	}

	@Test(dataProvider="getData")
	public void loginUser(String un,String pw)
	{
	Reporter.log("Username : " +un+" PAssword : "+pw);
	System.out.println("Username : " +un+" PAssword : "+pw);
	}
	@Test(dataProvider="getData")
	public void loginHrm(String un,String pw) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pw);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
