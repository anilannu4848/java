package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickonWebElementUsingJava {

	public static void main(String[] args) throws Exception {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.apsrtconline.in/oprs-web/");
	
	WebElement btnsearch = driver.findElement(By.name("searchBtn"));
	
	((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click()",btnsearch);
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
		
	}

}
