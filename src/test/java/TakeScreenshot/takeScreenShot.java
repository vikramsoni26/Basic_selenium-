package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		// Take Screenshot downcast
		// WebDriver does not have the getScreenshotAs() method, so we downcast it to TakesScreenshot interface.
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		// take source using method ready for saving or copy
		
		File source = tks.getScreenshotAs(OutputType.FILE); // Screenshot is captured & Stored in temporary memory
		
		// Destination path
		File destination = new File("./src/test/java/TakeScreenshot/dummy file.png"); // Screenshot saved in this file path
		
		// Copy file
		FileHandler.copy(source, destination);  // Screenshot saved successfully
		
		System.out.println("Take ScreenShot Succesfully");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
