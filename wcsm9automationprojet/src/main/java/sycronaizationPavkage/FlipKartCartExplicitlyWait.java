package sycronaizationPavkage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartCartExplicitlyWait {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //option interface
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Time units -- seconds, minutes, hours.
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobiles");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='_2iLD__']"))).click();
		 
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2iLD__']")).click();
		
		
	}

}
