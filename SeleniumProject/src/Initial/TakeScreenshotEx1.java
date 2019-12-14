package Initial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotEx1 {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement uname= driver.findElement(By.xpath("//body"));
		
		File src =uname.getScreenshotAs(OutputType.FILE);
		File dest= new File("./photo/" + "uname1.png");
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
