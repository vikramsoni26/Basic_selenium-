package Final_daybefore_mock;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block2_TASK_3_ALERTS {
public static void main(String[] args) {
	/*Use site:
	 * https://demoqa.com/alerts
	 */
	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	// Simple Alert
	driver.findElement(By.id("alertButton")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();	
	
	// confirmButton
	driver.findElement(By.id("confirmButton")).click();
	Alert alert1 = driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert.dismiss();
	
	// promtButton
	driver.findElement(By.id("promtButton")).click();
	Alert alert2 = driver.switchTo().alert();
	alert2.sendKeys("Admin:");
	System.out.println(alert2.getText());
    alert2.accept(); 	
	
	
	
	
}
}
