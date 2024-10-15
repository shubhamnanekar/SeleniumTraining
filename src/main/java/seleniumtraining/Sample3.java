
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signup")).click();
		driver.navigate().back();
	}
}
