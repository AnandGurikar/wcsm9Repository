package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		driver.findElement(By.cssSelector("button[class^='btn']")).click();
		driver.findElement(By.cssSelector("button[class$='btn-small']")).click();
		driver.findElement(By.cssSelector("button[class*='btn-su']")).click();
		
		
	}

}
