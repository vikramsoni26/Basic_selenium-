package Day_14MarAdvanced_Sele_practice;

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

public class task2_YouTube_Screenshot_Program {
public static void main(String[] args) throws IOException, InterruptedException {
	/*Program requirements:

		1️. Launch Chrome
		2️. Open https://www.youtube.com

		3️. Search "Automation Testing Tutorial"
		4️. Take screenshot of page
		5️. Save as youtube.png
		6️. Close browser
		*/
	// 1️. Launch Chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// 2️. Open https://www.youtube.com
	driver.get("https://www.youtube.com");
	
	// 3️. Search "Automation Testing Tutorial"
	WebElement element =driver.findElement(By.name("search_query"));
	element.sendKeys("Automation Testing Tutorial" + Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(130));
	
	// 4️. Take screenshot of page
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	System.out.println("Screenshot capture Succesfully");
	
	// 5️. Save as youtube.png
	File dest = new File("./src/test/java/Day_14MarAdvanced_Sele_practice/youtube.png");
	FileHandler.copy(src, dest);
	System.out.println("save sucessfully");
	
	// 6️. Close browser
	Thread.sleep(6000);
	driver.quit();
	
	
}
}