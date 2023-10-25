package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpath {

	public static void main(String[] args) throws InterruptedException {
//		Launch the Browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
// 		Maximize the Browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		Launch the application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Thread.sleep(4000);
// 		close the pop up window
		driver.findElement(By.xpath("//span[text()='✕']")).click();	
// 		Identify search text field and pass the value as mobile
		driver.findElement(By.name("q")).sendKeys("mobile",Keys.ENTER);
		Thread.sleep(2000);
//		Search find search icon and click
		driver.findElement(By.xpath("//button[contains(@aria-label,'Search')]")).click();
		Thread.sleep(4000);
//		For second product identify the price and get
		String price = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"
				+ "/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).getText();
		System.out.println(price); 
		
	}

}
