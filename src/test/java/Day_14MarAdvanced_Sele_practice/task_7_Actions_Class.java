package Day_14MarAdvanced_Sele_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task_7_Actions_Class {
public static void main(String[] args) throws InterruptedException {
	/*
	 * Steps:Hover on Account & Lists
	 * Print title
	 */
	// Step 1 Launch chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	
	// Step 2 Hover on Account & Lists
	WebElement Hover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions act = new Actions(driver);
	act.moveToElement(Hover).perform();
	System.out.println("Step 1: Hover performed.");
	Thread.sleep(1000);
	
	// Step 3 Print title
	String parentString = driver.getTitle();
	System.out.println("Parent titile:"+driver.getTitle());
}
}
