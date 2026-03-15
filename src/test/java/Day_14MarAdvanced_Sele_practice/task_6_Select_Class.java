package Day_14MarAdvanced_Sele_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task_6_Select_Class {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://the-internet.herokuapp.com/dropdown");
	// Create a drop down for web element
	WebElement tech = driver.findElement(By.xpath("//select[@id='dropdown']"));
	
	// Create object for select class
	Select seltech = new Select(tech);
	
	
	//Steps:Select Option 1
	seltech.selectByVisibleText("Option 1");
	
	WebElement first = seltech.getFirstSelectedOption();
//	System.out.println(first.getText());
    
	//Select Option 2
	seltech.selectByVisibleText("Option 2");
	
	List<WebElement> all = seltech.getAllSelectedOptions();
	for (WebElement i : all) {
		System.out.println(i.getText());
}
}
}
