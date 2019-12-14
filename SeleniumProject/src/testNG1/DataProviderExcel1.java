package testNG1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel1 {
	public WebDriver driver = null;
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

	}
	@DataProvider
	public String[][] getData() throws IOException{
		String data[][]=new String[4][2];
		FileInputStream fin = new FileInputStream("D:\\LoginOrange.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i=0;i<2;i++)
		{
		XSSFCell r0 = sheet.getRow(0).getCell(i);
		data[0][0]=r0.toString();
		}
		System.out.println();
		for(int i=0;i<2;i++)
		{
		XSSFCell r1 = sheet.getRow(1).getCell(i);
		
		XSSFCell r3 = sheet.getRow(1).getCell(i);
		System.out.print("  "+r1+"  ");
		
		}
		System.out.println();
		for(int i=0;i<2;i++)
		{
		XSSFCell r2 = sheet.getRow(2).getCell(i);
		System.out.print("  "+r2+"  ");
		}
		System.out.println();
		for(int i=0;i<2;i++)
		{
		XSSFCell r3 = sheet.getRow(3).getCell(i);
		System.out.print("  "+r3+"  ");
		}
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
