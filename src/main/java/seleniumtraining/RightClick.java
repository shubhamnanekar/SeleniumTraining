
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		WebElement target = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform(); // right click on given web element
	}
}
