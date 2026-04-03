package Final_daybefore_mock;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class block2_TASK_1_SCREENSHOT {
public static void main(String[] args) throws IOException, InterruptedException {
	/*- Launch browser Open any site
     *- Take screenshot
     *- Save as: screen.png 
	 */
	
	// Launch browser open any site
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/tournaments/mens-t20-world-cup-2026");
	System.out.println(driver.getTitle());
	
	// Take screenshot
	TakesScreenshot Ts = (TakesScreenshot) driver;
	File SRC = Ts.getScreenshotAs(OutputType.FILE);
	System.out.println("Screenshot captured sucessfully");
	
	// Save as: Screen.png
	File Dest = new File("./src/test/java/Final_daybefore_mock/Screen.png");
    FileHandler.copy(SRC, Dest);
    
    Thread.sleep(3000);
    driver.close();
    
}
}
