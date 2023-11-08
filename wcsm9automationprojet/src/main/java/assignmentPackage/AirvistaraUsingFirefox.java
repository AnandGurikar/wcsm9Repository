package assignmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AirvistaraUsingFirefox {
	public static void main(String[] args) throws InterruptedException {
		
// Create an instance of FirefoxOptions class
		FirefoxOptions options = new FirefoxOptions();

		// Add Firefox switch to disable notification			
		options.addPreference("permissions.default.desktop-notification",2);
		options.addPreference("network.cookie.cookieBehavior", 2);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 
		
	}

}
