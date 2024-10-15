
package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		// here we used findElements because xpath returning list of multiple matching Webelements
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		//System.out.println(searchResults);
		
		System.out.println("Count of Search results : "+searchResults.size());
		System.out.println("====================================");
		
		// to traverse through list, if we not used getText() then it will print webelements but we wants texts of that elements
		for(WebElement i : searchResults) // here type of reference variable 'i' is webelement because we are storing
			                              // webelements in that ref variable and it is going to traverse through the list of webelements.
		{
			System.out.println(i.getText());
		}
		
		//driver.findElement(By.xpath("(//ul[@class='G43f7e'])[1]/li[6]")).click();
		System.out.println("====================================");
		System.out.println(searchResults.get(0).getText());
		System.out.println("====================================");
		
		for(WebElement j : searchResults)
		{
			String actualResult = j.getText();
			if(actualResult.contains("pune news")) // contains() method is case sensitive
			{
				System.out.println("element to click : "+actualResult);
				j.click();
				break;
			}
		}
	}
}
