package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anand/OneDrive/Desktop/html%20tutorial/wcsm9webelements/SimpleLoginPage.html");
		driver.findElement(By.id("id1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("id2")).sendKeys("manager");
	}

}
