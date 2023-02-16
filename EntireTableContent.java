package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntireTableContent {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
	
	System.out.println(table.getText());
	
	Thread.sleep(3000);
	
	driver.quit();
		
		
	}

}
