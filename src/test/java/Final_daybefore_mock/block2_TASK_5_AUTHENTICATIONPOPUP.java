package Final_daybefore_mock;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class block2_TASK_5_AUTHENTICATIONPOPUP {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	HasAuthentication auth = (HasAuthentication) driver;
	auth.register(UsernameAndPassword.of("admin", "admin"));
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	Thread.sleep(3000);
	
	
}

}
