package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
// switch the controls to active elements or transfer the control to active elements
		// switchTo() ----> TargetLocator interface
		// activeElement() -----> WebElements interface
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		
		
		
		
	}
}
