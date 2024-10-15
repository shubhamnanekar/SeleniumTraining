
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup
{
	public static void main(String[] args)
	{
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	   
	   /* driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	   driver.manage().window().maximize();
	   
	   //WebElement frame = driver.findElement(By.id("iframeResult"));
	   //driver.switchTo().frame(frame); // 1) using WebElement frameElement
	   
	   //driver.switchTo().frame(0); // 2) using index
	   
	   driver.switchTo().frame("iframeResult"); // 3) using by id or name
	   driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	   System.out.println(driver.switchTo().alert().getText());
	   driver.switchTo().alert().accept();
	   
	   driver.switchTo().parentFrame();
	   System.out.println(driver.getTitle()); */
	   
	   // 4) using sendkeys
	   
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	   driver.manage().window().maximize();
	   
	   driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	   driver.switchTo().alert().sendKeys("Shubham");
	   driver.switchTo().alert().accept();
	   System.out.println( driver.findElement(By.id("demo")).getText());
	   
	   driver.switchTo().parentFrame();
	   System.out.println(driver.getTitle());
	  }
}
