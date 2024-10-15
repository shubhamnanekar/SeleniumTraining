
package seleniumtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"table02\"]//tr"));
		System.out.println("Total rows in table:"+rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"table02\"]/thead/tr/th"));
		System.out.println("Total columns in table:"+columns.size());
		
		System.out.println("\nRows with text\n");
		// rows with text
		for (int i=0; i<rows.size(); i++)
		{
			System.out.println(rows.get(i).getText());
		}
		
		System.out.println("\nColumns with name\n");
		// columns with name
		for (int j=0; j<columns.size(); j++)
		{
			System.out.print(columns.get(j).getText()+" ");
		}
	}
}
