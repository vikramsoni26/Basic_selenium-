package Final_daybefore_mock;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block3_task2_WINDOW_HANDLING {
public static void main(String[] args) {
	
	// Launch the chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/windows");
	
	// TASK 1 — GET WINDOW
	String Parent = driver.getWindowHandle();
	System.out.println(Parent);
	
	// click
	WebElement multiwindowbtn = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
	multiwindowbtn.click();
	
	// TASK 2 — GET ALL WINDOWS
	Set<String> allwindow = driver.getWindowHandles();
	System.out.println(allwindow);
	
	// TASK 3 — SWITCH WINDOWS
	for (String window: allwindow) {
		if(!window.equals(Parent)) {
			driver.switchTo().window(window);
			driver.close();
		}
	}
	
	// TASK 4 — CLOSE CHILD + BACK TO PARENTTASK 4 — CLOSE CHILD + BACK TO PARENT
	driver.switchTo().window(Parent);
	   
}
}
