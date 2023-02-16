package automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadTest {

	public static void main(String[] args) throws Exception  {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	
	driver.manage().window().maximize();
	
	driver.get("https://www.foundit.in/");
	
	driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
	
	WebElement btnupload = driver.findElement(By.id("file-upload"));
	
	//btnupload.sendKeys("C:\\CV1");
	
	Thread.sleep(5000);
	
	Actions actions = new Actions(driver);
	
	actions.click(btnupload).perform();
	
	Thread.sleep(5000);
	
	Robot robot = new Robot();
	
	StringSelection selection = new StringSelection("C:\\CV1");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyRelease(KeyEvent.VK_V);
	
	Thread.sleep(5000);
	

	}

}
