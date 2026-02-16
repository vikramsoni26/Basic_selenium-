package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshot_zomato {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		// Downcasting webDriver to take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// Capture a ScrrenShot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		// Destination path
		File des = new File("./src/test/java/TakeScreenshot/zomato_dummy_file.png");
		
		// copy file
		FileHandler.copy(src, des);
		
		System.out.println("Screenshot captured successfully");
		
		driver.quit();
		
	}

}
