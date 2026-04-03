package Session_2_XPATH_DRILL;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirrd_time {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
	// Launch the browser 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	// click
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	
	// first i stroe parent window
	String parent = driver.getWindowHandle();
	
	// then i get all window id
	Set<String> allWindow = driver.getWindowHandles();
	
	// then i switch to child window
	for(String window: allWindow) {
		if(!window.equals(parent)) {
			driver.switchTo().window(window);
		}
	}
	
	// perform action and quit
	driver.switchTo().window(parent);
	system.out.println(driver.getCurrentUrl());
	
}
}
