package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenShot_Instagrame {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		//Downcasting WebDriver to TakesScreenshot
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		// Capture screenshot
		File source = tks.getScreenshotAs(OutputType.FILE);
		
		// Destination path
		File destination = new File("./src/test/java/TakeScreenshot/Instagrame_dummy_file.png");
		
		// Copy file
		FileHandler.copy(source, destination);
		
		System.out.println("Screenshot captured successfully");
		
		driver.quit();
		
		
		
	}

}
