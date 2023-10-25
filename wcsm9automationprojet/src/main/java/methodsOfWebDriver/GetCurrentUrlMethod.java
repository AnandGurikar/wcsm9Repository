package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * it is used to get the URL  of current web page  and 
 * return type of method  is sting
 */
public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://desktop-nd34b8a/login.do");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
