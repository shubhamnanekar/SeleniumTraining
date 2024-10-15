

package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second 
{
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Mobile",Keys.ENTER);
	    driver.close();
	}

}
