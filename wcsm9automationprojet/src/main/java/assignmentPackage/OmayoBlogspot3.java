package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspot3 {
	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://omayo.blogspot.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		  Thread.sleep(4000);
		  
		  driver.close();
		  					  
	}

}
