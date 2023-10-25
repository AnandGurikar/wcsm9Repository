package assignmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VijaysSales {

	public static void main(String[] args) throws InterruptedException {
				
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.vijaysales.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			

	}

}
