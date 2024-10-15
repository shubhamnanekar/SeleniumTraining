
package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinksOfWebpage 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.err.println("Total Tags:"+alltags.size());
		
		for(int i = 0; i < alltags.size(); i++)
		{
			System.out.println("Links on WebPage are:"+alltags.get(i).getAttribute("href"));
			System.out.println("Text with Links:"+alltags.get(i).getText());
		}*/
		
		// How to handle auto suggestions
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).click();
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Software");
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
	}
}
