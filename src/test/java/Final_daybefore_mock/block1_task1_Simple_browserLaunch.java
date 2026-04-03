package Final_daybefore_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class block1_task1_Simple_browserLaunch {
public static void main(String[] args) {
	
	/*Launch Chrome
	- Maximize
	- Open: https://automationwithpiyush.vercel.app/locators.html
	- Print Title
	- Close browser
	*/
	
	// Launch Chrome
	WebDriver driver = new ChromeDriver();
	System.out.println("Chrome launch sucessfully");
	
	// Maximize
	driver.manage().window().maximize();
	System.out.println("Browser sucesffuly maximized");
	
	// Open: https://automationwithpiyush.vercel.app/locators.html
	driver.get("https://automationwithpiyush.vercel.app/locators.html");
	System.out.println("Website open sucessfully");
	
	// Print title
	String Title = driver.getTitle();
	System.out.println("Title:"+Title);
	
	// CLose browser
	driver.close();
	
	
	
	
}
	
	
}
