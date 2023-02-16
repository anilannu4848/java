package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersTest {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.apsrtconline.in/oprs-web/");
	
	driver.findElement(By.className("chkavailabilityBtn"));
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
	
		
		
		
	}

}
