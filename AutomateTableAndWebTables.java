package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateTableAndWebTables {

	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	System.out.println(driver.findElement(By.xpath("//table")).getSize());
	
	System.out.println(driver.findElement(By.cssSelector("table")).getSize());
	
	System.out.println(driver.findElement(By.tagName("table")).getSize());
	
	Thread.sleep(5000);
	
	driver.quit();
	
			
	}

}
