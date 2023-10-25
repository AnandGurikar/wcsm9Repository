package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// used to launch the web application and perform operations such as backward, forward, refresh
public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
// to launch the web application by using navigate method
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		
// to perform the backward operation
		driver.navigate().back();
		Thread.sleep(2000);
		
// to perform the forward operation
		driver.navigate().forward();
		Thread.sleep(2000);
		
// to perform the refresh operation
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}

}
