package Day_13MarAdvanced_Sele_Coding_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NextExcersise_Selenium_program {

	public static void main(String[] args) throws IOException {
		//Write a Selenium program to:
        //1️. Open https://the-internet.herokuapp.com/login
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //2️. Enter wrong username and password
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("fghdghhf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("rutouupup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //3️. Click login
		WebElement lg = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
		lg.click();
		
        //4️. Capture error message text
		WebElement element = driver.findElement(By.xpath("//div[@id='flash']"));
	    File src = element.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./src/test/java/Day_13MarAdvanced_Sele_Coding_Practice/Selenium_Element.png");
	    FileHandler.copy(src, dest);
	    System.out.println(" Web Element login Screenshot Captured Succesfully");
	   
		
        //5️. Take screenshot if login fails
	    TakesScreenshot ts = (TakesScreenshot)driver;
        File src1 = ts.getScreenshotAs(OutputType.FILE);
        File dest1 = new File("./src/test/java/Day_13MarAdvanced_Sele_Coding_Practice/next_Question.png");
        FileHandler.copy(src1, dest1);
        System.out.println("Screenshot Captured Succesfully");
        driver.quit();
	}

}
