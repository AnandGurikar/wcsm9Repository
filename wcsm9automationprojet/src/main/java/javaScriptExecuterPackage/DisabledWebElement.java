package javaScriptExecuterPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Enabled Mode']")).click();
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		Thread.sleep(2000);
		//Perform explicit type cast into JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Handle disabled name text box
		jse.executeScript("document.getElementById('name').value='Anand'");
		//Handle disabled email text box
		jse.executeScript("document.getElementById('email').value='exaple@gmail.com'");
		//Handle disabled password text box
		jse.executeScript("document.getElementById('password').value='Pasword@123'");
		//Click on disabled register button
		WebElement disabledRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		if (disabledRegisterButton.isEnabled()) 
		{
			jse.executeScript("arguments[0].click()", disabledRegisterButton);
			System.out.println("Click");
		}
		else 
		{
			System.out.println("Not Click");
		}
		
		
	}

}
