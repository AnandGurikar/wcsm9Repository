package javaScriptExecuterPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayaDisabledTextBox {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.id("tb2"));
		Point loc = ele.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-55)+")");
				
//		jse.executeScript("arguments[0].scrollIntoView(false)", ele);
		
		jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
		Thread.sleep(2000);
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Sreenshots/ele.png");
		Files.copy(src, dest);
		
		
	}

}
