package popUpHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://demoapps.qspiders.com/");
//		
//		driver.findElement(By.xpath("//section[text()='Popups']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();//Confirm Box
//		
//		Alert conPopUp = driver.switchTo().alert();
//
//		System.out.println(conPopUp.getText());
//
//
//		Thread.sleep(2000);
//		conPopUp.accept();
//		conPopUp.dismiss();
		
		
		
		
	}

}
