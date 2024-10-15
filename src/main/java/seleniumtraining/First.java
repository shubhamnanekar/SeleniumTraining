

package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First 
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver_win32\\chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		/* driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click(); */
	}

}
