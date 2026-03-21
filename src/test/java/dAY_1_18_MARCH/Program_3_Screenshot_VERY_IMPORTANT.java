package dAY_1_18_MARCH;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Program_3_Screenshot_VERY_IMPORTANT {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open an Irctc.
		driver.get("https://www.irctc.co.in/nget/train-search");
		
        // Take ScreenShot
		TakesScreenshot Ts = (TakesScreenshot)driver;
		File SRC = Ts.getScreenshotAs(OutputType.FILE);
		System.out.println("Screenshot Captured Sucessfully");
		
		// Save as Screenshot.png
		File DEST = new File("./src//test//java//dAY_1_18_MARCH//Irctc.png");
	    FileHandler.copy(SRC, DEST);
		System.out.println("ScreenShot Save Sucessfully");
		
		driver.quit();
		
		
	}

}
