package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateRadioButtonsDropDown {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.thepancard.com/");
	
	driver.findElement(By.linkText("Apply New PAN Card")).click();
	
	WebElement rbArmy = driver.findElement(By.id("rblCategory_1"));
	
	System.out.println(rbArmy.isSelected());
	
	rbArmy.click();
	
	System.out.println(rbArmy.isSelected());
	
	WebElement rbNavy = driver.findElement(By.id("rblCategory_2"));
	
	System.out.println(rbNavy.isSelected());
	
	WebElement txtDOB = driver.findElement(By.id("txtDOB"));
	
	System.out.println(txtDOB.isEnabled());
	
	Thread.sleep(3000);
	
	txtDOB.sendKeys("25/10/1996");
	
	System.out.println(txtDOB.getAttribute("value"));
	
	Thread.sleep(3000);
	
	txtDOB.clear();
	
	WebElement lstPOI = driver.findElement(By.id("proof_dob"));
	
	lstPOI.sendKeys(" Passport");
	
	Thread.sleep(5000);
	
	WebElement cbtc = driver.findElement(By.id("agreeproof"));
	
	System.out.println(cbtc.isSelected());
	
	Thread.sleep(3000);
	
	cbtc.click();
	
	System.out.println(cbtc.isSelected());
	
	Thread.sleep(3000);
	
	cbtc.click();
	
	Thread.sleep(5000);
	
	driver.quit();
			

	}

}
