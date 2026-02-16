package working_with_sc_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
     
	  public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver(); // ChromeDriver class, ChromeDriver() this is constructor
      // This line launches a Chrome browser and allows Selenium to control it.
	  // WebDriver is an interface, driver is a reference variable, // ChromeDriver is a class whose constructor is called using new keyword 
		  driver.manage().window().maximize();
	  // This line maximizes the browser window opened by Selenium.	  
      		
		  driver.get("https://www.facebook.com/");
	  // This line opens the Facebook website in the browser.	  
		  Thread.sleep(1000); // time is milisecond.
	  // This line pauses the execution of the program for 1 second.	  
	  // Thread Represents the currently running thread Selenium code runs inside a thread

      // Write admin in un input field using id   
		  WebElement un = driver.findElement(By.id("email"));
		  un.sendKeys("admin");
	  // This code finds the username/email textbox and types “admin” into it.	  
		  
		  Thread.sleep(1000);
     // Write 12345678 in pwd input field using name	  
		  WebElement pwd = driver.findElement(By.name("pass"));  
	      pwd.sendKeys("12345678");
	 // This code finds the password textbox and enters the password “12345678”.     
	      
	      Thread.sleep(1000);
    // Click on forgotten pwd? using linktext & partialLinkText     
		  WebElement fp = driver.findElement(By.partialLinkText("Forgotten password?"));   
		  fp.click();
	// This code finds the “Forgotten password?” link and clicks on it.
		  Thread.sleep(5000);
		  driver.quit();
		  
		  
		  
	  }
	
	
	
}
