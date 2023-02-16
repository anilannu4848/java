package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElementLocated {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://github.com/");
	
	driver.findElement(By.partialLinkText("Sign up")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	
	WebElement txtemail = driver.findElement(By.id("email"));
	
	txtemail.sendKeys("anilannu351@gmail.com");
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
	
		

	}

}
