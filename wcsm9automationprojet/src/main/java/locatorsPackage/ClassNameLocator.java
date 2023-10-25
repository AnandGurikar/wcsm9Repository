package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		
		driver.findElement(By.tagName("gLFyf")).clear();
		driver.switchTo().activeElement().sendKeys("Joey Tribbiani",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		
		
		
	}

}
