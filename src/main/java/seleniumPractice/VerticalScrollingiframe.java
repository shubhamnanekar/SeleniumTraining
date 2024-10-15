
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScrollingiframe 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		// switching selenium focus to iframe
		driver.switchTo().frame("courses-iframe");
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'An Academy to ')]")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scrollUptoElement = driver.findElement(By.xpath("//h2[text()='Featured Courses']"));
		js.executeScript("arguments[1].srollIntoView(true);",scrollUptoElement);
		
	}
}
