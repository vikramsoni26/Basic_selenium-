package Session_2_XPATH_DRILL;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_3_WINDOW_HANDLING {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	// Launch Chrome and website
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	// click
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	
	// First I store parent window ID
	String parent = driver.getWindowHandle();
	System.out.println(driver.getTitle());
	
	// Then I get all window IDs
	Set<String> allWindows = driver.getWindowHandles();
	System.out.println(driver.getWindowHandles());
	
    // Then I switch to child window
	for(String window : allWindows) {
		if(!window.equals(parent)) {
			driver.switchTo().window(window);
		}
	}
	
    // Perform action and come back
	driver.switchTo().window(parent);
	System.out.println(driver.getCurrentUrl());
	
	
}
}
