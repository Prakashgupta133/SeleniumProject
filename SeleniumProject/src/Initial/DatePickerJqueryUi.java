package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerJqueryUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
				  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
				  
				  WebDriver driver =new ChromeDriver();  
				
				/*
				 * System.setProperty("webdriver.gecko.driver",
				 * "C:\\Users\\praka\\Downloads\\geckodriver-v0.25.0-win32\\geckodriver.exe");
				 * 
				 * WebDriver driver =new FirefoxDriver();
				 */ 
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/datepicker/");
				Thread.sleep(4000);	
				WebElement frame1= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame1);
				driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
				driver.findElement(By.xpath("//td[contains(@class,'today')]")).click();
				Thread.sleep(2000);	
				WebElement getD=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
				getD.click();
				
				System.out.println(getD);
				System.out.println("XXXX");
				Thread.sleep(2000);
		/*
		 * System.out.println(getD.isDisplayed()); System.out.println(getD.isEnabled());
		 * System.out.println(getD.isSelected()); System.out.println(getD.getText());
		 */
				System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));
				System.out.println("XXXXWW");
			//	driver.switchTo().defaultContent();
				
				Thread.sleep(2000);	
			driver.close();

	}

}
