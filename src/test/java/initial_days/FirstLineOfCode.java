package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstLineOfCode {

	public static void main(String[] args) {
		WebDriver Driver1= new ChromeDriver();
		WebDriver Driver2= new EdgeDriver();
		
		Driver1.get("https://www.youtube.com/@JobsTargetM/videos");
		
		// webdriver is a type
		// driver is a ref variable
		// new is a keyword which will create random memory space in heap area
		// CD() is cons call which will do three jobs
		// 1> it will load , reg. and re-initialize the non static members into heap area
		// 2> it will start the server 
		// 3> it will launch the empty browser  

	}

}
