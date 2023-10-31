package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	public static void main(String[] args) throws IOException {
		
		//Directly create the object of driver specific class
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		// Take the screen shot
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/demoapps ss.jpg");
		Files.copy(scr, dest);
	
	}

}
