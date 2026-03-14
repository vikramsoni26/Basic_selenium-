package Day_14MarAdvanced_Sele_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_Google_Search_Automation {
public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.google.com");

	        driver.findElement(By.name("q"))
	              .sendKeys("Selenium WebDriver tutorial" + Keys.ENTER);

	        System.out.println("Page Title: " + driver.getTitle());

	        driver.quit();
	    }
	
}

