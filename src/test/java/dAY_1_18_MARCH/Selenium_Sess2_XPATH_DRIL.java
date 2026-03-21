package dAY_1_18_MARCH;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Sess2_XPATH_DRIL {
public static void main(String[] args) throws InterruptedException {
	
	/* Selenium WebDriver Practice Portal
     We are going to inspect the dom to find element based on the required locators
	 Web site link https://automationwithpiyush.vercel.app/locators.html.
	*/
	
    // Launch the chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// Launch the Website.
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	
	// Id and Name
	WebElement Username =driver.findElement(By.xpath("//input[@id='login-username']"));
	Username.sendKeys("Admin");
	
	WebElement Email = driver.findElement(By.xpath("//input[@name='user_email_address']"));
	Email.sendKeys("admin@gmail.com");
	Thread.sleep(3000);
	
	
	// LinkText and PartialLinkText
	WebElement GoTodashboard = driver.findElement(By.xpath("//a[text()='Go to Dashboard']"));
	GoTodashboard.click();
	
	WebElement TermsAndCondition = driver.findElement(By.xpath("//a[contains(text(),'Terms and')]"));
	TermsAndCondition.click();
	
	// ClassName and Tag name
	List<WebElement> Image = driver.findElements(By.xpath("//div[@class='flex space-x-4']"));
	
	System.out.println("Total Image: "+ Image.size()); 
	
	// Find all links by tag name
	WebElement Home = driver.findElement(By.xpath("//a[text()='Home']"));
	Home.click();
	System.out.println(Home.getText());
	
	// Part 2: CSS Selectors & Advanced XPath
	// 1. CSS Selectors Practice
	WebElement css = driver.findElement(By.cssSelector("input[type='password']"));
	css.sendKeys("admin");
	
	// 2. Target me using parent child
	WebElement TUPC =driver.findElement(By.cssSelector("div[id='css-parent']"));
	TUPC.click();
	
	// 3. The Ultimate XPath Mastery Challenge
	// 3.1 a) XPath by Attribute:
	WebElement SP =driver.findElement(By.xpath("//input[@placeholder='Search Products...']"));
	SP.sendKeys("Samsung s23 5g phone");
	
	// b) XPath by Text Function:
	WebElement TF =driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
	TF.click();
	
	// c contains starts with
	WebElement cc= driver.findElement(By.xpath("//div[starts-with(@id, 'success-msg')]"));
	cc.click();
	
	// contains with
	WebElement cc1 = driver.findElement(By.xpath("//div[contains(@class, 'alert-box')]"));
	cc1.click();
	
	// multiple Attribute
	WebElement ma = driver.findElement(By.xpath("//input[@data-role='admin']"));
	ma.click();
	
	// surronding
	// Task: Find the "Delete" button exactly for "Jane Smith" without using indexing.
	WebElement su = driver.findElement(By.xpath("//td[text()='Jane Smith']/following-sibling::td//button[text()='Delete']"));
	su.click();
	
	// Axes Practice (Parent/Child/Ancestor):
	WebElement Axe = driver.findElement(By.xpath("//div[@class='ancestor-box border-2 border-dashed border-gray-400 p-4 rounded text-center']"));
	Axe.click();
	
	// x path by indexing
	WebElement inde = driver.findElement(By.xpath("//label[2]//input[1]"));
	inde.click();
	
	Thread.sleep(4000);
	driver.quit();
	
	
	
}
}
