package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * it is used to close the parent  or current browser and return type is void as well as child browser's or all browsers that are open and 
 * return type is void
 */
public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		// to maximize the chrome browser
		driver.manage().window().maximize();
		
		// to pause the script for 2 sec
		Thread.sleep(2000);
		
		// to open the web page
		driver.get("http://omayo.blogspot.com/");
		
		// to pause the script for 2 sec
		Thread.sleep(2000); 
		
		// to  click on "Open a popup window" link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		driver.close();
	}

}
