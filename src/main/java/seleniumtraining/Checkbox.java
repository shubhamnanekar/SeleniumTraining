

package seleniumtraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		// For page scroll down here we used Actions class
		
		/*Actions actions = new Actions(driver);
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='purple']"));
		actions.moveToElement(checkbox);
		actions.perform();
		
		driver.findElement(By.xpath("//input[@value='red']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='red']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='orange']")).click();
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkboxes present on webpage are "+allcheckbox.size());
		
		for( int i = 0; i < allcheckbox.size(); i++ )
		{
			System.out.println("\n Checkbox with colour "+allcheckbox.get(i).getAttribute("value"));
		}*/
		
		// How to handle radio buttons
		
		WebElement radiobutton =driver.findElement(By.xpath("//input[@type='radio'][3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radiobutton);
		actions.perform();
		
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][1]")).isSelected());
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		
		List<WebElement> allradiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons present on webpage are "+allradiobuttons.size());
	
		for ( int i = 0; i < allradiobuttons.size(); i++)
		{
			System.out.println("Radio buttons with given name: "+allradiobuttons.get(i).getText());
		}
		
		}
}
