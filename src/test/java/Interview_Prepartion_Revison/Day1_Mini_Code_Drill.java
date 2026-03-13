package Interview_Prepartion_Revison;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Mini_Code_Drill {
	public static void main(String[] args) throws InterruptedException {
	    
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    System.out.println("Chrome Succesfully launch");
	    Thread.sleep(3000);
	    // Maximize window
	    driver.manage().window().maximize();
	    System.out.println("Window Succesfully maximized");
	    Thread.sleep(1000);
	    
	    // Apply Implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    System.out.println("Implicit wait Succesfully Applyied");
	    Thread.sleep(1000);
	    // Open a Web site.
	    driver.navigate().to("https://www.youtube.com/");
	    System.out.println("Web site Succesfully open");
	    Thread.sleep(1000);
	    
	    // Locate element using XPath
	    driver.findElement(By.xpath("//input[@name='search_query']"));
	    System.out.println("Search Element is located");
	    Thread.sleep(1000);
	    
	    // Click it
	    driver.findElement(By.xpath("//div[@id='start']//button[@id='button']//div")).click();
	    System.out.println("clicking succesfully done.");
	    Thread.sleep(3000);
	    // Close browser
	    driver.close();
	    System.out.println("browser succesfully Close");
	    
	    
	}

}
