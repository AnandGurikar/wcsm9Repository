package qsp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		// to launch firefox browser we need to create object of firefox browser class 
		WebDriver driver = new FirefoxDriver();		
		System.out.println("FireFox Browser Opened!!!!!");
		
		// to maximize or minimize we need to use method from WebDriver interface
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		// to stop execution of script use Thread class and sleep method
		Thread.sleep(8000);
		
		/* to close the browser we need to call a method from WebDriver interface i.e
		 * close(); method 
		 */
		driver.close();
		System.out.println("FireFox Browser Closed!!!!!");
	}

}