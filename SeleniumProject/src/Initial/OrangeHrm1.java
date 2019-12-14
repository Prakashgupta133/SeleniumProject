package Initial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm1 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver =new ChromeDriver();  
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Admin Usermanagement user search and select
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("george");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@id,'ohrmList')]")).click();
		Thread.sleep(4000);
		
		//Recruitment serch
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click();
		driver.findElement(By.xpath("//input[@id='btnSrch']")).click();
		Thread.sleep(4000);
		
		//Logout
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
