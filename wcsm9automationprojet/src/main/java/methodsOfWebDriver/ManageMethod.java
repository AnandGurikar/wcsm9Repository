package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// it is used to handle the browser properties(.maximize,set size,set position)
public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	
// to maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
// to minimize the browser window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
// to full screen the browser
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
// to set the size of the browser window	
		Dimension targetSize = new Dimension(450,350);
		driver.manage().window().setSize(targetSize );
		Thread.sleep(2000);
		
// to set the position of browser window
		
		Point targetPosition = new Point(450,220);
		driver.manage().window().setPosition(targetPosition );
		
		
		
		
	}

}
