package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
	public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/");
	//Take the screen shot of web page
	TakesScreenshot ts = (TakesScreenshot)driver;
	//Call the method
	File src = ts.getScreenshotAs(OutputType.FILE);
	//Define way for storing Screenshot
	File dest = new File("./Screenshots/selenium ss.png");
	
	// Store screen shot to destination
	Files.copy(src, dest);
	
	}

}
