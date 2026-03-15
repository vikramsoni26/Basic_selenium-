package Day_15Mar_Selenium_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task_2_Screenshot_Program {
public static void main(String[] args) throws IOException {
	
	/*Launch Chrome
	 *Open https://www.youtube.com
	 *Search Automation Testing Tutorial
	 *Take screenshot
	 *Save file
	 *Close browser
	 */
	
	// Step 1 Launch Chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Chome sucessfully launch");
	
	// Step 2 Open https://www.youtube.com
	driver.get("https://www.youtube.com");
	System.out.println("www.youtube.com sucessfully open");
	
	// Step 3 Search Automation Testing Tutorial
	WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));
	element.sendKeys("Automation Testing Tutorial" + Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	// Step 4 Take screenshot
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	System.out.println("Screenshot captured Sucessfully");
	
	// Step 5 Save File
	File dest = new File("./src/test/java/Day_15Mar_Selenium_practice/youtube.png");
	FileHandler.copy(src, dest);
	
	// Step 6 close 
	driver.quit();
}
}
