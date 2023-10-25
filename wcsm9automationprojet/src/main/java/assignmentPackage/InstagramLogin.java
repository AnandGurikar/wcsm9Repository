package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("admin123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(@class,'acap')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}

}
