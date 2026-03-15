package Day_15Mar_Selenium_practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3_Window_Handling {
public static void main(String[] args) {
	/*Website:https://the-internet.herokuapp.com/windows
	 * Steps:
	 * Launch browser
	 * Store parent window ID
	 * Click Click Here
	 * Get all windows
	 * Switch to child window
	 * Print child title
	 * Switch back to parent window
	 * Print parent title
	 */
	
	        // Step 1 Launch Chrome
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			// Step 2 Open Website:https://the-internet.herokuapp.com/windows
			driver.get("https://the-internet.herokuapp.com/windows");
			System.out.println("https://the-internet.herokuapp.com/windows sucessfully open");
			
			// Step 3 Store parent window ID
			String ParentWindowID = driver.getWindowHandle();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("Parent window id store sucessfully");
			
			// Step 4 click
			WebElement multiwindowbtn = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
			multiwindowbtn.click();
			
			// Step 5 getAllwindow
			Set<String> allWindowIDs = driver.getWindowHandles();
			
			// Step 6 Switch to child window
			for (String window : allWindowIDs) {
				if(!window.equals(ParentWindowID)) {
					driver.switchTo().window(window);
				}
			}
			
			// Step 7 Print child title
			System.out.println("Child window title:"+ driver.getTitle());
			
			// Step 8 Switch back to parent window
			driver.switchTo().window(ParentWindowID);
			
			// Step 9 Print parent title
			System.out.println("Parent window titile:"+driver.getTitle());
			
			// Step 10 close
			driver.quit();
}
}
