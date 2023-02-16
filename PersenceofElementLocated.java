package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PersenceofElementLocated {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://my.microfocus.com/");
	
	driver.findElement(By.partialLinkText("Login")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
	
	WebElement txtusername = driver.findElement(By.id("username"));
	
	Thread.sleep(5000);
	
	txtusername.sendKeys("ANILANNU");
	
	Thread.sleep(3000);
	
	driver.quit();
		

	}

}
