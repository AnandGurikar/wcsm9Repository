package sycronaizationPavkage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartCartImplicitWait {
	public static void main(String[] args){
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //option interface
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//Time units -- seconds, minutes, hours.
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//a[@class ='_3RX0a-' and(@title='Cart')]")).click();
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
		
		// button[contains(class,'_222sdgjh')]
		
	}

}
