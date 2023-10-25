package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * it is used to get the title of current web page  and 
 * return type of method  is sting
 */
public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		// to get the title of page 
/*		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		Thread.sleep(4000);
*/
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		
		driver.close();
		driver.quit();
	}

}
