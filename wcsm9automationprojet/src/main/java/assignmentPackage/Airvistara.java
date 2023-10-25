package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Airvistara {
	public static void main(String[] args) throws InterruptedException {
		
// Create an instance of ChromeOptions class.
		ChromeOptions options=new ChromeOptions();
		
// Add chrome switch to disable notification – “–disable-notifications”		
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-cookies");

// Pass ChromeOptions instance to ChromeDriver Constructor.
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
// Navigate to the web page
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(4000);

		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchFrom")).sendKeys("PQN");
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchTo")).sendKeys("BOM");
		Thread.sleep(2000);
		driver.findElement(By.id("departCalendar")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nextYr")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("presentYr")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		
				
	}

}
