package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertIsPresent {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ADMIN/Downloads/WaitUntilAlertDisplayed.html");
		
	driver.findElement(By.xpath("//button[text()='Click']"));
	
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(120));
    
    wait.until(ExpectedConditions.alertIsPresent());
    
    driver.switchTo().alert().accept();
    
    Thread.sleep(3000);
    
    driver.quit();
    
    
		
	}

}
