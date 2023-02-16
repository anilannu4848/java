package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateSuggestionsAndKeyBoard {

	public static void main(String[] args) throws Exception {
	
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		WebElement txtsource = driver.findElement(By.id("fromPlaceName"));
		
		Actions action = new Actions(driver);
		
		Actions actions = new Actions(driver);
		
		action.sendKeys(txtsource,"hyderabad").perform();
		
		Thread.sleep(3000);
		
	    actions.sendKeys(Keys.ARROW_DOWN).perform();
	    
	    Thread.sleep(3000);
	    
	    actions.sendKeys(Keys.ENTER).perform();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
		
			
	}

}
