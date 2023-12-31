package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComtextClickORRightClick {
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://demoapps.qspiders.com/");
		  
		  driver.findElement(By.xpath("//section[text()='Button']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		  
		  
		  WebElement ele1 = driver.findElement(By.xpath("//button[text()='Right Click']"));
		  Actions act = new Actions(driver);
		  Thread.sleep(2000);
		  act.contextClick(ele1).perform();
		  driver.findElement(By.xpath("//div[text()='Yes']")).click();
		  WebElement ver1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		  
		  if (ver1.isDisplayed()) {
			  System.out.println("Right is Done");
			
		}
		  else {
			System.out.println("Right is not Done");
		}
		  
	}

}
