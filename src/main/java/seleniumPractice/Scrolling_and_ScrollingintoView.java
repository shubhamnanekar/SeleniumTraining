
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_and_ScrollingintoView 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// using scrolling
//		js.executeScript("window.scrollBy(0,3000)"); // scrolling in downward direction
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)"); // scrolling in upward direction
		
		// using Scrolling into view
		// first we have to identify or locate the webelement upto we have to scroll and store it in reference variable
		// js.executeScript("arguments[0].scrollIntoView(true);",Ref);
		WebElement scrollUptoElement = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",scrollUptoElement);
		
		// selenium focus by default on main page we have to switch the focus to iframe
		driver.switchTo().frame("courses-iframe");
		String a = driver.findElement(By.xpath("//a[text()='About Us']")).getText();
		System.out.println(a);
		
		// scrollintoview in iframe
		WebElement scrollUptoElement1 = driver.findElement(By.xpath("//h2[text()='Featured Courses']"));
		//JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js.executeScript("arguments[1].srollIntoView(true);",scrollUptoElement1);
	}
}
