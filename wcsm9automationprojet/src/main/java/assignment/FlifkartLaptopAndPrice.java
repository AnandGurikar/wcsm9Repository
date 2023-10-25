package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlifkartLaptopAndPrice {
	public static void main(String[] args) throws InterruptedException {
		
		 // launch browser
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//span[text()='✕']")).click();
		 driver.findElement(By.name("q")).sendKeys("laptops");
		 // click on search icon
		 driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Brand')]")).click();
		 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Processor')]")).click();
		 driver.findElement(By.xpath("//span33 MORE")).click();	
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
//		//div[@class='_3879cV' and (text()='Core i7')]
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Customer Ratings')]")).click();
//		 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
//		 driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
//		 
		 
	}

}
