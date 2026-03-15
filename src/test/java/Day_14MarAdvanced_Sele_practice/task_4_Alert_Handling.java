package Day_14MarAdvanced_Sele_practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_4_Alert_Handling {
public static void main(String[] args) throws InterruptedException {
	
	
	// Step 1 
	WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    // Simple Alert
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();  // click ok
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
    // Confirmation Alert
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
    Alert alert1 = driver.switchTo().alert();
    System.out.println(alert1.getText());
   // alert1.accept();
      alert1.dismiss();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    // Prompt Alert
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
    Alert alert2 = driver.switchTo().alert();
    System.out.println(alert2.getText());
    alert2.sendKeys("India");
    alert2.accept();
    Thread.sleep(3000);
    driver.quit();
}
}
