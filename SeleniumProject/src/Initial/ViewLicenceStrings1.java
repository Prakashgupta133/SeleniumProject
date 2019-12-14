package Initial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewLicenceStrings1 {

	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		String s1;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");

		driver.findElement(By.linkText("View License")).click();

		String parentHandle = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for (String s : handles) {
			if (!s.equals(parentHandle)) {
				driver.switchTo().window(s);
			}
		}

		List<WebElement> ul = driver.findElements(By.xpath("//div[@class=\"licenseText no_restrictions_para\"]/p[5]"));

		ArrayList<String> list = new ArrayList<String>();

		for (WebElement ele : ul) {
			list.add(ele.getText());
		}
		for (String def : list) {
			System.out.println(def);
			
		}
		s1=list.toString();
		String []split1=s1.split("\"");
		for(int i=1;i<split1.length;i=i+2)
		{
			System.out.println(split1[i]);
		}
		 
		driver.quit();

	}

}
