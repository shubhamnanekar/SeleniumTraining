
package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_4 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//span[text()='To']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Pune");
		
		
		
	}
}
