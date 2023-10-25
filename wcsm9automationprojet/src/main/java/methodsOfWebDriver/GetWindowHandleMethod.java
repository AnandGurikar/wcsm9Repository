package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * it is used to get the address  of parent or current browser or  window  and 
 * return type of method  is sting
 */
public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		// to print address of parent browser.....(the browser or window has controls)
		String parentHandle=driver.getWindowHandle();
		System.out.println(parentHandle);
		
		driver.quit();
		
	}

}
