package working_with_dd_Selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayDD = driver.findElement(By.xpath("//select[@id='day']"));
		Select daySelect = new Select(dayDD);
		daySelect.selectByVisibleText("26");
		
		Thread.sleep(3000);
		// DD for month
		WebElement monthDD = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDD);
		monthSelect.selectByVisibleText("Mar");
		
		// DD for year
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		Select yearSelect = new Select(yearDD);
		yearSelect.selectByValue("1996");
		
		Thread.sleep(3000);
		System.out.println("date, month and year data is updated");
		driver.quit();
		
		
		
	}

}
