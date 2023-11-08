package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheChatFrameOfBluestone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
//		WebElement chatIcon = 
		Thread.sleep(2000);
		driver.findElement(By.id("fc_widget")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("Anand");//chat-fc-name
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("example@gmail.com");//chat-fc-email
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");//chat-fc-phone
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		
//		driver.switchTo().frame(chatIcon);
		
	
//		driver.quit();
		
	}

}
