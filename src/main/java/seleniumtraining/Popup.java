
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Holiday Packages'])[1]")).click();
		
		
		
	}
}
