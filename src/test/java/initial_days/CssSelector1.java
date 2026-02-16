package initial_days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {
     public static void main(String[] args) throws InterruptedException {
    	 
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 
    	 driver.get("https://www.facebook.com/");
    	 
    	 WebElement ca= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
    	 ca.click();
    	 
    	 Thread.sleep(1000);
    	 
    	 WebElement fn= driver.findElement(By.name("firstname"));
    	 fn.sendKeys("Steave");
    	 Thread.sleep(1000);
    	 
    	 WebElement ln= driver.findElement(By.cssSelector("input[name='lastname']"));
    	 ln.sendKeys("Stifler");
    	 Thread.sleep(1000);
    	 
    	 WebElement dob= driver.findElement(By.id("day"));
    	 dob.sendKeys("26");
    	 Thread.sleep(1000);
    	 
    	 WebElement dobmonth= driver.findElement(By.name("birthday_month"));
    	 dobmonth.sendKeys("Nov");
    	 Thread.sleep(1000);
    	 
    	 WebElement dobyear= driver.findElement(By.cssSelector("[name='birthday_year']"));
    	 dobyear.sendKeys("1996");
    	 Thread.sleep(1000);
    	 
    	 WebElement gn= driver.findElement(By.cssSelector("input[value='2']"));
    	 gn.click();
    	 Thread.sleep(1000);
    	 
    	 WebElement em= driver.findElement(By.cssSelector("input[name='reg_email__']"));
    	 em.sendKeys("+1897564268");
    	 Thread.sleep(1000);
    	 
    	 WebElement pw= driver.findElement(By.id("password_step_input"));
    	 pw.sendKeys("abcderfg");
    	 Thread.sleep(1000);
    	 
    	 WebElement sp= driver.findElement(By.cssSelector("button[type='submit']"));
    	 sp.click();
    	 Thread.sleep(5000);
    	 
    	 driver.quit();
    	 
    	 
    	 
     }
}
