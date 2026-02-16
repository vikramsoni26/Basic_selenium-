package Takewebelementscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takewebelement_Screenshot_instagrame_login {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		// Web Element Screenshot method
		
		WebElement element = driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1 xti2d7y']"));
	    File src = element.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./src/test/java/Takewebelementscreenshot/Instagrame_dummy_file.png");
	    FileHandler.copy(src, dest);
	    System.out.println("Instagrame Web Element login Screenshot Captured Succesfully");
	    driver.quit();
	
	
	}

}
