package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * it is used to get the source code  of current web page  and 
 * return type of method  is sting
 */
public class GetPageSourceMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-nd34b8a/login.do");
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
