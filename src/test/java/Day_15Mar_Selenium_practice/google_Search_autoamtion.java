package Day_15Mar_Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Search_autoamtion {
	public static void main(String[] args) {
		
		/*Steps:
		 * Launch Chrome
		 * Open https://www.google.com
		 * Find search box
		 * Type "Selenium WebDriver tutorial"
		 * Press Enter
		 * Print page title
		 * Close browser
		 */
		// Step 1 Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Step 2 Open https://www.google.com
		driver.get("https://www.google.com");
		System.out.println("WWW.google.com sucessfully open");
		
		// Step 3 Find search box
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		// Step 4 Type "Selenium WebDriver tutorial"
		element.sendKeys("Selenium WebDriver tutorial");
		
		// Step 5 Press Enter
		element.sendKeys("Selenium WebDriver tutorial" + Keys.ENTER);
		
		// Step 6 Print page titile
		System.out.println("String title:"+driver.getTitle());
		
		// Step 7 close Browser
	    driver.quit();
	}

}
