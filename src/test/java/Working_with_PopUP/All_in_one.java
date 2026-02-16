package Working_with_PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_in_one {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/popups.html");

		// ========================
		// 1️⃣ Alert Popup
		// ========================
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

		// ========================
		// 2️⃣ Confirm Popup
		// ========================
		driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();   // or alert2.dismiss();

		// ========================
		// 3️⃣ Prompt Popup
		// ========================
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Vikram");
		System.out.println(alert3.getText());
		alert3.accept();

		// ========================
		// 4️⃣ Authentication Popup
		// ========================
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(3000);
		driver.quit();
	}
}
