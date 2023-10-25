package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications"); options.addArguments("--disable-cookies");
		 
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.irctc.co.in/nget/train-search");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("PUNE",Keys.TAB);
		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-14')]")).click();	 
		 driver.findElement(By.xpath(null));
		 
		 
		 
		 
		 
	}

}
