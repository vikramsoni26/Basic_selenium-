package Final_daybefore_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class block4_task2_pop_up {
public static void main(String[] args) {
	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationwithpiyush.vercel.app/popups.html");
	
	// 1. HIDDEN DIVISION POPUP
	driver.findElement(By.xpath("//button[contains(text(),'Launch')]")).click();
	
	
}
}
