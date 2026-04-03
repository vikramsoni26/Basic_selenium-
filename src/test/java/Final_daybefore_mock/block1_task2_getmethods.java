package Final_daybefore_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class block1_task2_getmethods {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*getTitle()
         *- getCurrentUrl()
         * - getPageSource() (print first 200 chars only)
		 */
		
		// launch the chrome and website
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		// get title
		String Title = driver.getTitle();
		System.out.println(Title);
		
		// get current url
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		// getPageSource() (print first 200 chars only)
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		driver.close();
		
	}
	
}
