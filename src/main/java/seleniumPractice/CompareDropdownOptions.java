
// compare dropdown options 
package seleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareDropdownOptions 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement options = driver.findElement(By.cssSelector("select#cars"));
		
		Select s = new Select(options);
		List<WebElement> getAllOptions = s.getOptions();
	

		List<String> actual = new ArrayList<String>();
		
		for(WebElement i : getAllOptions)
		{
			actual.add(i.getText());
		}
		System.out.println("==== Actual result ====");
		for(String j : actual)
		{
			System.out.println(j);
		}
		
		List<String> expected = new ArrayList<String>();
		expected.add("Volvo");
		expected.add("Saab");
		expected.add("Opel");
		expected.add("Audi");
		
		System.out.println("==== Expected result ====");
		for(String k : expected)
		{
			System.out.println(k);
		}
		System.out.println("==== Result ====");
		boolean result = actual.equals(expected);
		System.out.println(result);
	}
}
