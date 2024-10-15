
package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shubham@gmail.com");
		driver.findElement(By.id("email")).clear();
		
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getCssValue("text-rendering"));
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isSelected());
    }
}
