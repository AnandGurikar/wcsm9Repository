package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/anand/OneDrive/Desktop/html%20tutorial/wcsm9webelements/Link.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Seleni")).click();
		driver.findElement(By.linkText("")).click();
		
		
	}

}
