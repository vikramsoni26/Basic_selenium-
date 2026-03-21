package dAY_1_18_MARCH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_1_Google_Search_XPath {
	public static void main(String[] args) {
		
		// 1.Launch Chrome
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Open Google
	    driver.get("https://www.google.com/");
	    driver.getTitle();
	    
	    // 3. Find search box (XPath)
	    WebElement SearchBox = driver.findElement(By.id("APjFqb"));
	    SearchBox.sendKeys("Selenium Interview Question");
	    SearchBox.sendKeys(Keys.ENTER);
	    driver.quit();
	    
	    
	    
	    
		
		
	}

}
