package Initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewOrangeHrm1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8012/orangehrm/index.php");
		Thread.sleep(2000);
		
		/*
		 * String s1 =
		 * driver.findElement(By.xpath("//font[text()='Orange']")).getText(); String
		 * s2=driver.findElement(By.xpath("//font[text()='HRM']")).getText();
		 * 
		 * if(s1.equals("Orange") && s2.equals("HRM")) {
		 * System.out.println("Orange HRM page opened"); }
		 */
		
		String orangeTitle=driver.getTitle();
		if(orangeTitle.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Orange HRM title Verified");
		}

		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Page Title Verified");
		}
		
		String welcomeText=driver.findElement(By.xpath("//div[@id='option-menu-bar']/ul/li")).getText();
		if(welcomeText.equals("Welcome admin"))
		{
			System.out.println("Welcome text verified");
			
		}
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
