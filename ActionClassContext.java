package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassContext {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	    WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	    
	    Actions action = new Actions(driver);
	    
	    action.contextClick(element).perform();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	    
	    
	}

}
