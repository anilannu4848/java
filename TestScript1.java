package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1 {
	
	private WebDriver driver = null;
	
	@Parameters({"Browser"})
	
	@Test
	
	private void test(@Optional("chrome")String browser) {
		
	switch(browser) {
	
	case "chrome":
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		break;
		
	case "firefox":
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		break;
		
	case "edge":
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		break;
	
	}
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/");
	
	driver.quit();

}
}