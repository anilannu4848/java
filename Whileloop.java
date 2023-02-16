package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whileloop {

	public static void main(String[] args) {
	
	System.out.println("start");
	
	String browser = "chrome";
	
	while (browser.equals("chrome")) {
		
	System.out.println("ChromeTest browser execution");
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	browser = "firefox";
	
	}
	
	System.out.println("end");
	
	
	}

}
