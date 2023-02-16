package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndHold {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.id("draggable"));
	
	WebElement target = driver.findElement(By.id("Droppable"));
	
	Actions action = new Actions(driver);
	
	action.clickAndHold(source).release(target).perform();
	
	Thread.sleep(3000);
	
	driver.quit();
		

	}

}