package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlifkartEndToEndFlow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //option interface
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//Time units -- seconds, minutes, hours.
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.className("(//div[@class='CXW8mj'])[2]")).click();
//		driver.findElement(By.className(""))
	}

}
