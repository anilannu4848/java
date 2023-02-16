package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertUntilButton {

	public static void main(String[] args) throws Exception {

WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("file:///C:/Users/ADMIN/Downloads/WaitUntilButtonEnabled.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(120));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn01")));
	
	    WebElement btnSearch = driver.findElement(By.id("btn01"));
	    
	    btnSearch.click();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	    
	    
		
	}

}
