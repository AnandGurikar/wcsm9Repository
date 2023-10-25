package sycronaizationPavkage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartCart {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); //option interface
		Thread.sleep(2000);		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class ='_3RX0a-' and(@title='Cart')]")).click();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		
		// button[contains(class,'_222sdgjh')]
		
	}

}
