package Final_daybefore_mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class block2_TASK_2_SELECT_CLASS {


public static void main(String[] args) throws InterruptedException {

	/*Use site:
	 * https://demoqa.com/select-menu
	 * Perform:
	 * - selectByVisibleText
	 * - selectByIndex
	 * - selectByValue
	 */
	
	// 1, Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// 2. use site https://demoqa.com/select-menu
	driver.get("https://demoqa.com/select-menu");
	System.out.println(driver.getTitle());
	
	// perform
	
	// 1. create a drop down for web element
	WebElement techdd  = driver.findElement(By.id("oldSelectMenu"));
	
	// 2. Create a object for select class
	Select S = new Select (techdd);
	
	// 3. Perform the task
	S.selectByVisibleText("Red");
	S.selectByValue("1");
	S.selectByIndex(3);
	
    @SuppressWarnings("unused")
	WebElement first = S.getFirstSelectedOption();
	// System.out.println(first.getText());
	
    List<WebElement> all = S.getAllSelectedOptions();
	for (WebElement i : all) {
		System.out.println(i.getText());
		
		Thread.sleep(5000);
		driver.close();
		
	
	
	
	
	
	
}
}
}
