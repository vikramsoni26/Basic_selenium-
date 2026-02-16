package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot_IRCTC {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    
	    // Downcasting WebDriver to take screenshot
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    // Capture Screenshot
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    // Destination path
	    File dest = new File("./src/test/java/TakeScreenshot/Irctc_dummy_file.png");
	    
	    // Copy captured Screenshot
	    FileHandler.copy(src, dest);
	    
	    System.out.println("Screenshot Captured Succesfully");
	    
	    driver.quit();
		
	}

}
