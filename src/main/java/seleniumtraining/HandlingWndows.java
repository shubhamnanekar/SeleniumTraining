
package seleniumtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWndows
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement upto = driver.findElement(By.xpath("//*[@id=\"1675754273447_1hb\"]/div[1]/div/header/h2"));
		actions.moveToElement(upto);
		actions.perform();
		
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: AI + Data + CRM = more sales and happier customers.']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		// returns a set of window handles which can be used to iterate over all open windows.
		
		Iterator<String> iterator = windowHandles.iterator();
		// iterator is a variable that can used to iterate through this particular set
		
		// using this iterator.next() get windowhandle for this particular window
		String parentWindow = iterator.next();
		System.out.println(parentWindow);
		String childWindow = iterator.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow); // switch to child window
		System.out.println(driver.getTitle());
		driver.findElement(By.name("UserFirstName")).sendKeys("Shubham");
		driver.findElement(By.name("UserLastName")).sendKeys("Nanekar");
		
		driver.switchTo().window(parentWindow); // switch to parent window
		System.out.println(driver.getTitle());
	}
}
