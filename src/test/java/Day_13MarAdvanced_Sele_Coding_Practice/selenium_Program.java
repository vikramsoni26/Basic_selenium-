package Day_13MarAdvanced_Sele_Coding_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class selenium_Program {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Task1 Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome sucesfully launched");
		
		// Task2 Open YouTube
		driver.get("https://www.youtube.com/");
		System.out.println("YouTube open succesfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Search "Selenium tutorial"
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Selenium tutorial");
        driver.findElement(By.xpath("//button[@title='Search']//div")).click();
        System.out.println("Selenium tutorial Search Succesfully");
        Thread.sleep(4000);
        
        // Take screenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./src/test/java/Day_13MarAdvanced_Sele_Coding_Practice/Selenium_program.png");
        FileHandler.copy(src, dest);
        System.out.println("Screenshot Captured Succesfully");
        Thread.sleep(2000);
        
        // Close browser
        driver.close();
        /*
         * Interviewers may ask:
         Q: Why do we typecast WebDriver to TakesScreenshot?
         A: Because getScreenshotAs() method belongs to the TakesScreenshot interface, so we need to typecast 
         the WebDriver object.
         Example: TakesScreenshot ts = (TakesScreenshot) driver;
         */
        
        
        
	}

}
