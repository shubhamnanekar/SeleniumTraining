
package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links present on this page are : "+allLinks.size());
		for(WebElement i : allLinks)
		{
			System.out.println(i.getText());
		}
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Powered by ')]")).getText());
	}
}
