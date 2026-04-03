package Final_daybefore_mock;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class block1_task3_xpathdrill {
public static void main(String[] args) {
	
	/*Write XPath for:
🔹 1. Username field (by id)
🔹 2. Email field (by name)
🔹 3. "Go to Dashboard" (text)
🔹 4. "Terms and Conditions" (contains text)
🔹 5. Search box (placeholder)
🔹 6. Button "Confirm" (contains text)
🔹 7 "Jane Smith" → Delete button (following-sibling)
	 * 
	 */
	
	// Launch the browser and website
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	
	// 1. Username field (by id)
	WebElement UN = driver.findElement(By.xpath("//input[@id='login-username']"));
    UN.sendKeys("admin");
    System.out.println(UN);
    
    // 2.Email field (by name)
    WebElement EM = driver.findElement(By.xpath("//input[@name='user_email_address']"));
    EM.sendKeys("admin");
    System.out.println(EM);
    
    // 3. "Go to Dashboard" (text)
    WebElement Link = driver.findElement(By.xpath("//a[normalize-space()='Go to Dashboard']"));
    Link.click();
    System.out.println("Link go to Dashboard sucessfully clicked");
    
    // 4. "Terms and Conditions" (contains text)
    WebElement TC = driver.findElement(By.xpath("//a[contains(text(),'Click here to read our Terms and')]"));
    TC.click();
    System.out.println(TC);
    
    // 5.Search box (placeholder)
    WebElement SB = driver.findElement(By.xpath("//input[@placeholder='Search Products...']"));
    SB.sendKeys("ICC");
    System.out.println(SB);
    
    // 6. Button "Confirm" (contains text)
    WebElement Button = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
    Button.click();
    System.out.println(Button);
    
    // 7 "Jane Smith" → Delete button (following-sibling)
    WebElement Ax = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/button[1]"));
    Ax.click();
    System.out.println(Ax);
    
    driver.close();
}}
