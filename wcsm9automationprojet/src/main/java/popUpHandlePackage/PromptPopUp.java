package popUpHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();//Prompt Alert Box
		
		Thread.sleep(6000);
		Alert promptAlertBox = driver.switchTo().alert();
		Thread.sleep(6000);
		driver.switchTo().activeElement().sendKeys("yes");
		promptAlertBox.sendKeys("Yes");
		System.out.println(promptAlertBox.getText());
		Thread.sleep(6000);
		promptAlertBox.accept();
//		conPopUp.dismiss();
		driver.close();
		
		
		
		
	}

}
