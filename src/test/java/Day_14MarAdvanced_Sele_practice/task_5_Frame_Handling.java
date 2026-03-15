package Day_14MarAdvanced_Sele_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_5_Frame_Handling {
  public static void main(String[] args) {
	/*Website:https://the-internet.herokuapp.com/iframe
	 * Steps:
	 * Switch to iframe
	 * Clear text
	 * Type Hello Automation
	 * Switch back to main page
	 * 
	 */
	  
	  // Step 1
	  WebDriver driver  = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  
	  // Step 2
	  WebElement Frame = driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
      driver.switchTo().frame(Frame);
                 
      // Step 3
      driver.switchTo().defaultContent();
  
  }
}
