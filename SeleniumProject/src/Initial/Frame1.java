package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8012/orangehrm/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul/li")).getText().equals("Welcome admin"));
		
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.id("txtEmployeeId")).getAttribute("value"));
		
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Prakash");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(1000);
		System.out.println("New Employee added");
		driver.findElement(By.xpath("//input[@class='backbutton']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();

	}
}
