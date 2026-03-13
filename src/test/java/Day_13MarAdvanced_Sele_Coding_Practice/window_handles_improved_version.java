package Day_13MarAdvanced_Sele_Coding_Practice;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class window_handles_improved_version {

	        public static void main(String[] args) {
	        // 1. Open https://the-internet.herokuapp.com/windows
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://the-internet.herokuapp.com/windows");     
	        
	        // 2️. Click "Click Here"
	        String parentWindow = driver.getWindowHandle();
	        driver.findElement(By.linkText("Click Here")).click();
	        Set<String> allWindows = driver.getWindowHandles();
	        
	        // 3️. Handle multiple windows       
	        for (String window : allWindows) {
	            if (!window.equals(parentWindow)) {
	                driver.switchTo().window(window);
	                
	        // 4️. Print title of child window
	                System.out.println("Child Window Title: " + driver.getTitle());
	            }
	        }
	        
	        // 5️. Switch back to parent window  
	        driver.switchTo().window(parentWindow);
	        System.out.println("Parent Window Title: " + driver.getTitle());
	        driver.quit();
	        /*
	         * Interviewers may ask:
             Q1: Difference between getWindowHandle() and getWindowHandles()
             An:1. getWindowHandle() → returns ID of current window
                2. getWindowHandles() → returns IDs of all open windows
             Q2: Why do we use Set<String>?
             Because:Window IDs are unique. Set does not allow duplicates
             Q3: What happens if we don't switch to the child window?
             An: Selenium will still operate in the parent window
                and cannot interact with child window elements
	         */
	    }
	}

