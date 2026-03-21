package Session_2_XPATH_DRILL;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTry {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	//2nd time program written window handle
	
	// First launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	// second i Perform click 
	driver.findElement(By.xpath("")).click();
	
	// First store i parent window
	String parent = driver.getWindowHandle();
	
	// then i get all window id
	Set<String> allwin = driver.getWindowHandles();
	
	// then i switch to child window
	for(String window : allwin) {
		if(!window.equals(parent)) {
			driver.switchTo().window(window);
		}
	}
	
	// Perform action and come back
	driver.switchTo().window(parent);
	System.out.println(driver.getCurrentUrl());
}
}
