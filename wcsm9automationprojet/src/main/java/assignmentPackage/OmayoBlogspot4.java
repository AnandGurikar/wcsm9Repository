package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspot4 {
	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://omayo.blogspot.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  String parentHandle = driver.getWindowHandle();
		  
		  driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		  Thread.sleep(4000);
		  
		  Set<String> allHandles = driver.getWindowHandles();	
		  
			for (String wh : allHandles) 
			{
				if (parentHandle.equals(wh))
				{
					System.out.println("Address of parent window...  "+wh);

				}
				else
				{
					System.out.println("Address of child window		"+wh);
					String childHanle = wh ;
					driver.switchTo().window(childHanle);
					Thread.sleep(2000);
					driver.close();
					
				}
			}
			
					  
	}

}
