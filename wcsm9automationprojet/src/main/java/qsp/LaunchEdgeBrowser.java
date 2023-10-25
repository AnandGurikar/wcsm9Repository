package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// to launch edge browser we need to create object of edge driver
		EdgeDriver driver = new EdgeDriver();
		System.out.println("Edge Browser is opened!!..");
		
		// to maximize and minimize we need to use method from WebDriver interface i.e manage() method
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		// to stop the execution of script use Thread class and sleep method
		Thread.sleep(6000);
		
		/* to close the edge browser we need to call method from WebDriver interface i.e
		 * close() method
		 */
		driver.close();
		System.out.println("Edge Browser is Closed!!!!..");
		
	}

}
