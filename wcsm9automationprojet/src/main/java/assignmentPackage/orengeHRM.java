package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orengeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("C:\\Users\\anand\\OneDrive\\Desktop\\html tutorial\\wcsm9webelements\\orangehrmlive.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("orenge")).click();
		Thread.sleep(2000);
		
//		driver.switchTo().activeElement().sendKeys("Admin");
// identify user name text box using cssSelector
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
// identify user Password box using cssSelector
		driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active']")).sendKeys("admin123");
		Thread.sleep(2000);
// identify log in button using cssSelector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
