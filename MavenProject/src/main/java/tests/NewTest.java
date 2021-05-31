package tests;
 
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

 
public class NewTest {  
	
	public WebDriver driver;
	@Test 
	public void openMyBlog() throws InterruptedException {     
		  driver.get("http://www.google.com/");
		  try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}  
		  // Let the user actually see something!     

		  WebElement searchBox = driver.findElement(By.name("q"));

		  searchBox.sendKeys("Nutanix");     

		  searchBox.submit();    
		  try{Thread.sleep(15000);}catch(InterruptedException e){System.out.println(e);}    // Let the user actually see something!     

	}
	
	@BeforeClass
	 public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");           
		 driver = new ChromeDriver();
		
	}
	
    @AfterClass
    public void afterClass() {
       driver.quit();  

	 } 
 
}