
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_6 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("yellow")).click();
		System.out.println(driver.findElement(By.id("yellow")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()='Yellow']")).getText());
		
		driver.findElement(By.id("basketball")).click();
		System.out.println(driver.findElement(By.id("basketball")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()='Basketball']")).getText());

	}
}
