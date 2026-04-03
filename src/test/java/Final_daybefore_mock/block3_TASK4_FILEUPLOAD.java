package Final_daybefore_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block3_TASK4_FILEUPLOAD {
public static void main(String[] args) {
	
	/*Use site:
	 * https://the-internet.herokuapp.com/upload
	 */
	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/upload");
	
	WebElement Upload = driver.findElement(By.id("file-upload"));
	Upload.sendKeys("D:\\NullPointer.java");  
	
	driver.findElement(By.id("file-submit")).click();
	System.out.println("File uploaded");
}
	
}
