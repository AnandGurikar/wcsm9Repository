package popUpHandlePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileHandlePopUpDemoApps {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();//File Uploads
		
		WebElement chooseFileButton = driver.findElement(By.name("file"));
		Actions act = new Actions(driver);
		act.doubleClick(chooseFileButton).perform();
		
		File file = new File("./autoITPgm/FileUpload.exe");
		String absPath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec(absPath);
		Thread.sleep(6000);
		Runtime.getRuntime().exec(absPath);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
