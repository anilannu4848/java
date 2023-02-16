package automation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	public static void main(String[] args) throws Exception {
		
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.apsrtconline.in/oprs-web/");
	
	Thread.sleep(3000);
	
	driver.quit();
	
	

	}

}
