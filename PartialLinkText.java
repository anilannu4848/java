package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PartialLinkText {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.thepancard.com/");
	
	driver.findElement(By.partialLinkText("Apply New PAN Card")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	}

}
