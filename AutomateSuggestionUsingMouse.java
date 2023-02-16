package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSuggestionUsingMouse {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		WebElement txtsource = driver.findElement(By.id("fromPlaceName"));
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(txtsource, "hyderabad").perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='HYDERABAD']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
