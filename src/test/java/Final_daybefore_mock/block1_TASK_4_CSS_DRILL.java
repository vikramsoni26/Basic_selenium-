package Final_daybefore_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block1_TASK_4_CSS_DRILL {
public static void main(String[] args) {
	/*Write CSS for:
	 * 1. Password field
	 * 2. Username using id
	 * 3. Email using name
	 * 4. Child selector (parent → input)
	 */
	
	// launch the chrome 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	System.out.println(driver.getTitle());
	
	// 1. Password field
	WebElement pw = driver.findElement(By.cssSelector("input[placeholder='Password input']"));
	pw.sendKeys("admin");
	System.out.println(pw);
	
	// 2. Username using id
	WebElement un = driver.findElement(By.cssSelector("input[placeholder='Password input']"));
	un.sendKeys("admin");
	System.out.println(un);
	
	// 3. email using name
	WebElement EM = driver.findElement(By.cssSelector("input[placeholder='Enter Email']"));
	EM.sendKeys("Stifler");
	System.out.println(EM);
	
	// 4. Child selector (parent → input)
	WebElement CS = driver.findElement(By.cssSelector("//button[class='text-red-600 hover:text-red-800 font-medium']"));
	CS.click();
	System.out.println(CS);
	
	
	
}
}
