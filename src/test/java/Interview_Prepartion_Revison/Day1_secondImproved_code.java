package Interview_Prepartion_Revison;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_secondImproved_code {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.youtube.com/");

		try {
		    WebElement searchBox = driver.findElement(By.name("search_query"));
		    searchBox.sendKeys("Selenium Interview Questions");
		    searchBox.submit();
		} catch (NoSuchElementException e) {
		    System.out.println("Search box not found");
		}

		driver.quit();
	}

}
