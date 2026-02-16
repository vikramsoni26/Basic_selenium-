package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		Thread.sleep(5000);
		
		// driver.close(); it will close current window.
	//	driver.close();
		// driver.quit(); it will all window and stop the web driver server
        driver.quit();
	}

}
