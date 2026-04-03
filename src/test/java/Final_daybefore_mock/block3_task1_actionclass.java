package Final_daybefore_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class block3_task1_actionclass {
public static void main(String[] args) throws InterruptedException {

	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationwithpiyush.vercel.app/actions.html");
	
	
	// Hover performed
	Actions act = new Actions(driver);
	WebElement Hover = driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));
	act.moveToElement(Hover).perform();
	System.out.println("Hover action performed");
	
	// Rgiht click
	WebElement Rightclick = driver.findElement(By.id("right-click-area"));
	act.contextClick(Rightclick).perform();
	System.out.println("Right click performed");
	
	// DOUBLE CLICK
	WebElement DOUBLECLICK = driver.findElement(By.id("db-icon"));
	act.doubleClick(DOUBLECLICK).perform();
	System.out.println("Double click performed");
	
	// DRAG AND DROP
	WebElement Drag_source = driver.findElement(By.id("prod-laptop"));
	WebElement Drag_dropsource = driver.findElement(By.id("cart-zone"));
	act.dragAndDrop(Drag_source, Drag_dropsource).perform();
	System.out.println("Drag and Drop are performed");
	Thread.sleep(3000);
	
	driver.close();
	
	
	
}
}
