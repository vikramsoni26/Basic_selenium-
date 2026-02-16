package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenShot_piyush {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		// Downcasting webDriver to take Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// Capture a ScreenShot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Destination path
		File des = new File("./src/test/java/TakeScreenshot/piyush_dummy_file.png");
		
		// Copy a screenShot
		FileHandler.copy(src, des);
		
		System.out.println("ScreenShot Captured Succesfully");
		
		driver.quit();
		
		
	}

}
