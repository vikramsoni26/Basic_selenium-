package initial_days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("vikramsoni751@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement pw = driver.findElement(By.name("pass"));
		pw.sendKeys("12345678");
		
		Thread.sleep(1000);
		
		WebElement lg = driver.findElement(By.cssSelector("button[name='login']"));
        lg.click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
