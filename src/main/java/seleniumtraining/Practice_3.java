
package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_3 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags count are "+alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println(alltags.get(i).getText());
		}*/
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
		driver.manage().window().maximize();
		List<WebElement> alloptiontags = driver.findElements(By.tagName("option"));
		System.out.println("Total Count "+alloptiontags.size());
		
		for(int i=0;i<alloptiontags.size();i++)
		{
			System.out.println(alloptiontags.get(i).getText());
		}

	}
}
