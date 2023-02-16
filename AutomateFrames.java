package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateFrames {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
	driver.switchTo().frame("iframeResult");
	
	WebElement listcars = driver.findElement(By.id("cars"));
	
    listcars.sendKeys("volvo");
    
    driver.switchTo().defaultContent();
    
    Thread.sleep(3000);
    
    driver.quit();
    
		
	}

}
