package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// java script test runner
/*
 * it is used to get the address  of parent as well as child browser or  window  and 
 * return type of method  is sting
 */
public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String parentHandle=driver.getWindowHandle();
//		System.out.println(parentHandle);
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		// to print the address of parent as well as child browser or window 
		Set<String> allHandles = driver.getWindowHandles();
//		System.out.println(allHandles);
		
		for (String wh : allHandles) 
		{
			if (parentHandle.equals(wh))
			{
				System.out.println("Address of parent window...  "+wh);

			}
			else
			{
				System.out.println("Address of child window		"+wh);
			}
		}
		
				driver.quit();
		
		
	}

}
