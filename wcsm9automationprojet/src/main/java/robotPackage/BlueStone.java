package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//Handle the pop up
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		//Perform Mouse Hover and click on 
		WebElement watchJewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(watchJewellery);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		Thread.sleep(2000);
		//Perform click and hold the target
		WebElement target = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		Robot robot = new Robot();
		act.clickAndHold(target);
		
		

	}

}
