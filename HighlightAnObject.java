package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightAnObject {

	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.thepancard.com/");
	
	driver.findElement(By.linkText("Apply New PAN Card")).click();
	
	WebElement txtDOB = driver.findElement(By.id("txtDOB"));
	
	txtDOB.click();
	
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("arguments[0].style.border = '2'px solid 'blue'");
	
	Thread.sleep(3000);
	
	driver.quit();
	
		
	}

}
