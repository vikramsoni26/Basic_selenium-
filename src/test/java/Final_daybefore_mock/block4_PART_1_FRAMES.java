package Final_daybefore_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class block4_PART_1_FRAMES {
	public static void main(String[] args) {
		
		// launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		
		// TASK 1 — SWITCH BY INDEX
		
		driver.switchTo().frame(1);
		
		// TASK 2 — SWITCH BY ID/NAME
		driver.switchTo().frame("sampleHeading");
		
		// TASK 3 — SWITCH BACK
		driver.switchTo().defaultContent();
		
		
		
	}

}
