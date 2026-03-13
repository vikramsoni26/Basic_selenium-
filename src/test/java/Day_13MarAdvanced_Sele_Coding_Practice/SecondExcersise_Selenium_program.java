package Day_13MarAdvanced_Sele_Coding_Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondExcersise_Selenium_program {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// 1. Open https://the-internet.herokuapp.com/windows
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		String parentWindowID = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        // 2️. Click "Click Here"
		WebElement multiWindowBtn  =driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		multiWindowBtn.click();
		
		Set<String> allWindowIDs = driver.getWindowHandles();
        // 3️. Handle multiple windows
		for (String windowID : allWindowIDs) {
			// Switch to every window that isn't the parent
			if (!windowID.equals(parentWindowID)) {
				driver.switchTo().window(windowID);

				String title = driver.getTitle();
				System.out.println("Switched to window: " + title);
		
			}
        // 4️. Print title of child window
        // 5️. Switch back to parent window
			driver.switchTo().window(parentWindowID);
			System.out.println("Returned to Parent Window: " + driver.getTitle());

			Thread.sleep(1000);

		}
	}		
}		

