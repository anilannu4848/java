package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

   public class Tc_001_AddToCart {
	
   private WebDriver driver = null;
  
  // Open Browser
  
  @BeforeTest

  public void openBrowser() {
	  
  WebDriverManager.chromedriver().setup();
  
  driver = new ChromeDriver();
  
  driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
  
  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
  
  driver.manage().window().maximize();
	
}
  
   //Login
  
   @BeforeMethod

   public void Login() {

   driver.get("https://www.saucedemo.com/");	
  
   driver.findElement(By.id("user-name")).sendKeys("standard_user");
  
   driver.findElement(By.id("password")).sendKeys("secret_sauce");
  
   driver.findElement(By.id("login-button")).click();
  
} 
    @org.testng.annotations.Test
    public void addtocart()throws Exception {
	  
	 // Add To Cart
	  
	Thread.sleep(5000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	
	Thread.sleep(5000);	
}
  
    //Logout
  
    @AfterMethod

    public void Logout() {
	
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  
	  driver.findElement(By.id("logout_sidebar_link")).click();
}
  
    public void closeBrowser() throws Exception{
	  
	  //close Browser
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	
}
	
}
  