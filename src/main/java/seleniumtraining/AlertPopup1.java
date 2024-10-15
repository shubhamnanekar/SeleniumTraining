
package seleniumtraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[id=alertButton]")).click();
		
		Thread.sleep(2000);
		
		// now here when we face a alert popup to handle it we have to switch selenium focus from main page to alert popup
		// by using this driver.switchTo().alert() we can do this
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
		String text = driver.findElement(By.xpath("//span[text()='Click Button to see alert ']")).getText();
		System.out.println(text);
	}
}
