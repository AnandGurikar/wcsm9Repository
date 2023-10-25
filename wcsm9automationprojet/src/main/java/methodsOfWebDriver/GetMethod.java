package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * it is used to launch the web application, it is asking for string url as an arguments and 
 * return type is void
 */
public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
	// to launch chrome browser
	WebDriver driver=new ChromeDriver();
	
	// to maximize the chrome browser
	driver.manage().window().maximize();
	
	// to pause the script for 2 sec
	Thread.sleep(2000);
	
	// to open the web page
	driver.get("https://www.primevideo.com/");
	
	// to pause the script for 2 sec
	Thread.sleep(2000); 
	
	driver.close();
	
	}
	
}
