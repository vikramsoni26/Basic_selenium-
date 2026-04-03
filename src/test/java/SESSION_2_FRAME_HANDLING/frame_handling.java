package SESSION_2_FRAME_HANDLING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handling {
public static void main(String[] args) {
	/*1. What is frame in selenium
	 * Frame is a web element that contains another HTML element inside the main page.
	 * To intract with elements inside a frame we must switch the driver context using switch()
	 * ().frame
	 * iframe is a separate DOM.
	 * Selenium cannot directly access inside it. So we switch using switchTo().frame()”
	 */
	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	
	
	// Switch to frame
	driver.switchTo().frame(2);
	
	// get text from
	String Text = driver.findElement(By.xpath("//iframe[@id='frame2']")).getText();
	System.out.println(Text);
	
}
}
