
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickByUsingIndex
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("pun");
		clickByIndex(driver, 6);
	}
	
	public static void clickByIndex(ChromeDriver driver, int i)
	{
		driver.findElement(By.xpath("(//ul[@class='G43f7e'])[1]/li[i]")).click();
	}
}
