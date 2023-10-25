package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		// to launch Chrome browser we need to create object of ChromeDrive class
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Opened!!!");
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to minimize the browser
		driver.manage().window().minimize();
		
		// to stop execution of script use Thread class and sleep method
		Thread.sleep(6000);
		// to close the browser upcast browser class into webdriver interface and   call close method with obj ref variable i.e driver
		driver.close();
		System.out.println("Chrome Browser Closed !!!!!");
		
	}

}
