package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificCellContent {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	WebElement cell = driver.findElement(By.xpath("((//table[@id='example']//tbody//tr)[2]//td)[3]"));
	
	System.out.println(cell.getText());
	
	Thread.sleep(5000);
	
	driver.quit();
	
		
		
	}

}
