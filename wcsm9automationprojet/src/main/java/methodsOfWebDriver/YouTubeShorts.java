package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeShorts {
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/shorts/");
		Thread.sleep(4000);
		driver.findElement(By.id("shorts-player")).click();
		while (i < 2) 
		{
			
			Thread.sleep(2000);
			driver.findElement(By.id("<button class=\"yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-xl yt-spec-button-shape-next--icon-button \" aria-label=\"Next video\" title=\"\" style=\"\"><div class=\"yt-spec-button-shape-next__icon\" aria-hidden=\"true\"><yt-icon style=\"width: 24px; height: 24px;\"><!--css-build:shady--><!--css-build:shady--><yt-icon-shape class=\"style-scope yt-icon\"><icon-shape class=\"yt-spec-icon-shape\"><div style=\"width: 100%; height: 100%; fill: currentcolor;\"><svg height=\"24\" viewBox=\"0 0 24 24\" width=\"24\" focusable=\"false\" style=\"pointer-events: none; display: block; width: 100%; height: 100%;\"><polygon points=\"18.65,11.65 12,18.29 12,4 11,4 11,18.29 4.35,11.65 3.65,12.35 11.5,20.21 19.35,12.35\"></polygon></svg></div></icon-shape></yt-icon-shape></yt-icon></div><yt-touch-feedback-shape style=\"border-radius: inherit;\"><div class=\"yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response\" aria-hidden=\"true\"><div class=\"yt-spec-touch-feedback-shape__stroke\" style=\"\"></div><div class=\"yt-spec-touch-feedback-shape__fill\" style=\"\"></div></div></yt-touch-feedback-shape></button>")).click();				
			i++;
		}	
		driver.quit();
		
	}

}
