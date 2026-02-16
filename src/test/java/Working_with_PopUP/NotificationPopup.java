package Working_with_PopUP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {

		// Create ChromeOptions object
		ChromeOptions options = new ChromeOptions();

		// Disable notification popup
		options.addArguments("--disable-notifications");

		// Pass options to ChromeDriver
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		System.out.println("Notification popup avoided successfully");

		driver.quit();
	}
}