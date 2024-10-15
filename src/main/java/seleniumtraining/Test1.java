
package seleniumtraining;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.id("email")).sendKeys("7744012232");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.name("tryanotherway")).click();
		
		
		
		//driver.findElement(By.xpath("//ul//li[@class='sbct']")).sendKeys("testing", Keys.ENTER);
		//driver.findElement(By.partialLinkText("Sachin Tendulkar - Wikipedia")).click();
	}
}
