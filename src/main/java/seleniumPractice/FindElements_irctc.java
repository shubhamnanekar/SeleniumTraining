
package seleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_irctc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("pur");
		
		Thread.sleep(3000);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li"));
		System.out.println("====================================");
		System.out.println("Count of searched results : "+searchResults.size());
		System.out.println("====================================");
		
		// for entering value in 'From' field
		for(WebElement i : searchResults)
		{
			String actualResult = i.getText();
			
			if(actualResult.contains("PURNEA JN - PRNA"))
			{
				System.out.println("element that we have to be click on is : "+actualResult);
				i.click();
				break;
			}
		}
		
		// for entering value in 'To' field
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("pur");
		
		Thread.sleep(3000);
		
		List<WebElement> searchResults1 = driver.findElements(By.xpath("//ul[@id='pr_id_2_list']/li"));
		System.out.println("====================================");
		System.out.println("Count of searched results : "+searchResults1.size());
		System.out.println("====================================");
		
		for(WebElement j : searchResults1)
		{
			String actualResult1 = j.getText();
			
			if(actualResult1.contains("SOLAPUR JN - SUR"))
			{
				System.out.println("element that we have to be click on is : "+actualResult1);
				j.click();
				break;
			}
		}
		
		System.out.println("====================================");
		
		String defaultSeletedElement = driver.findElement(By.xpath("//span[text()='GENERAL']")).getText();
		System.out.println("Default seleted element : "+defaultSeletedElement);
		driver.findElement(By.xpath("//span[text()='GENERAL']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> searchResults2 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Count of searched results : "+searchResults2.size());
		System.out.println("====================================");
		
		for(WebElement k : searchResults2)
		{
			String actualResult2 = k.getText();
			
			if(actualResult2.contains("DUTY PASS"))
			{
				System.out.println("element that we have to be click on is : "+actualResult2);
				k.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		
	}
}
