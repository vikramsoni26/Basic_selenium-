package Session_2_XPATH_DRILL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Level_1_BASIC {
public static void main(String[] args) throws InterruptedException {
	
	/*Search box (attribute)
	 * Button (text)
	 * Link (text)
	 * Input (name)
	 * Image (alt)
	 */
	
	// Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	
	
	// 1. Search Box 
	WebElement SB = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
	SB.sendKeys("Stifler");
	System.out.println("Username Enter Sucessfully");
	
	
	// 2. Button text
	WebElement BT = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
	BT.click();
	System.out.println("Button sucessfully clicked");
	
	// 3. Link text
	WebElement LT = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
	LT.click();
	System.out.println("Link text Sucessfully clicked");
	
	// 4. Input name
	WebElement IN = driver.findElement(By.xpath("//input[@name='user_email_address']"));
	IN.sendKeys("American Pie");
	System.out.println("Input name sucessfully handled");
	
	// 5. Image alt
	WebElement IA = driver.findElement(By.xpath("//img[@alt='User A']"));
	IA.click();
	System.out.println("A Image is clicked");
	
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
}
}
