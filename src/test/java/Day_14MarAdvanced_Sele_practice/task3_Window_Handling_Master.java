package Day_14MarAdvanced_Sele_practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3_Window_Handling_Master {
@SuppressWarnings("unused")
public static void main(String[] args) throws InterruptedException {
	/*
	 * Write again (without copying your old code):
	 * ProgramSite:https://the-internet.herokuapp.com/windows
	 * Steps:
	 * 1️. Launch Chrome
	 * 2️. Open website
	 * 3️. Store parent window ID
	 * 4️. Click Click Here
	 * 5️. Get all window handles
	 * 6️. Switch to child window
	 * 7️. Print child window title
	 * 8️. Switch back to parent window
	 * 9️. Print parent window title
	 * 10. Close browser
	 */
	

		 // 1️. Launch Chrome
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     System.out.println("Chrome Launch sucessfully");
	     
		 // 2️. Open website
	     driver.get("https://the-internet.herokuapp.com/windows");
	     System.out.println("Website Sucessfully open");
	     
		 // 3️. Store parent window ID
	     String parentWindowID = driver.getWindowHandle();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     System.out.println("Parent window id store sucessfully");
	     
		 // 4️. Click Click Here
	     WebElement multiwindowBtn = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
	     multiwindowBtn.click();
	     
		 // 5️. Get all window handles
	     Set<String> allWindowIDs = driver.getWindowHandles();
	     
		 // 6️. Switch to child window
	     for (String window : allWindowIDs) {
	            if (!window.equals(parentWindowID)) {
	                driver.switchTo().window(window);
	                
		 // 7️. Print child window title
	     System.out.println("Child Window Title: " + driver.getTitle());
	     
		 // 8️. Switch back to parent window
	     driver.switchTo().window(parentWindowID);
	     
		 // 9️. Print parent window title
	     System.out.println("Parent window Title:" + driver.getTitle());
	     
		 // 10. Close browser
	     Thread.sleep(3000);
	     driver.quit();
}
	     }
}
}