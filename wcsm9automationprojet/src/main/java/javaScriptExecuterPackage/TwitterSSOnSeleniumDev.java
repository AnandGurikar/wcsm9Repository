package javaScriptExecuterPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TwitterSSOnSeleniumDev {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		WebElement twitter = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		Point loc = twitter.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Scronshots/twitter1.jpg/");
		Files.copy(src1, dest1);

		Thread.sleep(2000);
		File src = twitter.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Scronshots/twitter.jpg");
		
		Files.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
	}

}
