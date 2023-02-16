package automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindowBasedOnIndex {

	public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.cypress.io/");
	
	driver.findElement(By.linkText("Sign up")).click();
	
	Set<String>set = driver.getWindowHandles();
	
	List<String>list = new ArrayList<String>(set);
	
	driver.switchTo().window(list.get(1));
	
	driver.findElement(By.xpath("(//span[@class='pull-left'])[3]")).click();
	
	driver.findElement(By.id("email")).sendKeys("anilannu351@gmail.com");
	
	Thread.sleep(3000);
	
	driver.quit();
		

	}

}
