package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anand/OneDrive/Desktop/html%20tutorial/wcsm9webelements/radio.html");
		
		Thread.sleep(2000);
		//identify the d radio button by using name locator
		driver.findElement(By.name("name4")).click();
		driver.findElement(By.name("name1")).click();

	}

}
