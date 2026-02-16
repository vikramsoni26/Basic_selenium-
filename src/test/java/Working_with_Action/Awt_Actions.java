package Working_with_Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Awt_Actions {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationwithpiyush.vercel.app/actions.html");
		
		// Step 1: Hover performed.
		
		WebElement tissue = driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));
		Actions act = new Actions(driver);
		act.moveToElement(tissue).perform();
		System.out.println("Step 1: Hover performed.");
		Thread.sleep(1000);
		
		// Step 2: Standard click performed
		
		WebElement click = driver.findElement(By.id("click-box"));
		act.click(click).perform();
		System.out.println("Step 2: Standard click performed");
		Thread.sleep(1000);
		
		// Step 3: Right-click diagnostic performed.
		
		WebElement rightclick = driver.findElement(By.xpath("//i[@class='fas fa-mouse text-3xl mb-3 text-gray-600']"));
		act.contextClick(rightclick).perform();
		System.out.println("Step 3: Right-click diagnostic performed.");
		Thread.sleep(1000);
		
		// Step 4: Double-tap successful.
		
		WebElement doubleClick = driver.findElement(By.id("db-icon"));
		act.doubleClick(doubleClick).perform();
		System.out.println("Step 4: Double-tap successful.");
		Thread.sleep(1000);
		
		// Step 5: Pressure applied (Click & Hold).
		
		WebElement clickAndHold = driver.findElement(By.id("hold-icon"));
		act.clickAndHold(clickAndHold).perform();
		System.out.println("Step 5: Pressure applied (Click & Hold).");
		Thread.sleep(1000);
		
		// Step 6: Transplant successful (Drag & Drop).
		
		WebElement drag_Source = driver.findElement(By.id("prod-phone"));
		WebElement drag_DropSource = driver.findElement(By.id("cart-zone"));
		act.dragAndDrop(drag_Source, drag_DropSource).perform();
		System.out.println("Step 6: Transplant successful (Drag & Drop).");
		Thread.sleep(1000);
		
		//Step 7: Slider moved to Tachycardia.
		
		WebElement seekbar = driver.findElement(By.id("pulse-slider"));
		act.clickAndHold(seekbar).moveToElement(seekbar, 500, 0).build().perform();
		System.out.println("Step 7: Slider moved to Tachycardia.");
		Thread.sleep(1000);
		act.clickAndHold(seekbar).moveToElement(seekbar, -500, 0).build().perform();
		System.out.println("Step 7: Slider moved to Bradycardia.");
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
