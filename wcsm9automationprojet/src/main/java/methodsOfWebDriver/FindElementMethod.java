package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Bike");
		Thread.sleep(4000);
		// identify all the suggestions of bike
		List<WebElement> bikeOptions = driver.findElements(By.xpath("//div[@class ='eIPGRd']"));
		Thread.sleep(2000);
		
		for (int i = 0; i < bikeOptions.size(); i++) {
			String options = bikeOptions.get(i).getText();
			Thread.sleep(2000);
			System.out.println(options);
		}
		Thread.sleep(4000);
//read all the suggestions of bike by using for each loop
		 for(WebElement op:bikeOptions)
		 {
			 String options = op.getText();
				Thread.sleep(2000);
				System.out.println(options);
			
		}
//		driver.quit();
		   
	}

}
