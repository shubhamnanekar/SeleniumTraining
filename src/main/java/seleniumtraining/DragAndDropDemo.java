
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
		/* Mouse over to target element
		WebElement moveToTarget = driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[3]/a"));
		actions.moveToElement(moveToTarget).perform();
		 Moves the mouse to the middle of the element */
		
		// How to handle resize widget use actions.dragAndDropBy(source_element, int x, int y)
		// source element means those element whose size we have to adjust 
		
		//driver.quit(); // Close the window
	}
}
