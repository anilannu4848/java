package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
    System.out.println("start");
    
    String input = "chrome";
    
    if(input.equals("chrome")) {
    	
    WebDriverManager.chromedriver().setup();
    
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://mvnrepository.com/");
    
    driver.quit();
    
    }	
		
	System.out.println("end");
    
	}

}
